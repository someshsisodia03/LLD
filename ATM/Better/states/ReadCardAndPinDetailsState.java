package LLD.ATM.Better.states;
import LLD.ATM.Better.DTO.*;
import LLD.ATM.Better.Enums.ATMState;
import LLD.ATM.Better.apis.*;
import LLD.ATM.Better.models.*;


public class ReadCardAndPinDetailsState implements State{
    private final ATM atm;
    private final backendApi backendApi;

    public ReadCardAndPinDetailsState(ATM atm, backendApi backendApi) {
        this.atm = atm;
        this.backendApi = backendApi;
    }
    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot initialize transaction while reading card and pin details");
    }

    @Override
    public boolean readCardAndPinDetails(Card card,int Pin) {
        boolean isValid = card.getCardManagerService(backendApi).validateCardDetails(card.getCardNumber(), card.getPin(), atm.getAtmId(),Pin);
        if(isValid) {
            atm.updateState(new ReadCashWithdrawalDetailsState(atm, backendApi));
        }
        else {
            atm.updateState(new EjectingCardState(atm, backendApi));
        }
        return isValid;

    }

    @Override
    public boolean readCashWithdrawalDetails(int transactionId, int amount,Card card) {
        throw new IllegalStateException("Cannot read cash withdrawal details while reading card and pin details");
    }

    @Override
    public int dispenseCash(Card card,int transactionId,int amount) {
        throw new IllegalStateException("Cannot dispense cash while reading card and pin details");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        atm.updateState(new ReadyForTransactionState(atm, backendApi));
        return backendApi.cancelTransaction(new cancelTransactionDTO(atm.getAtmId(), transactionId));        
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card while reading card and pin details");
    }

    @Override
    public ATMState getStatus() {
        return ATMState.READ_CARD_AND_PIN_DETAILS;
    }
}