package LLD.ATM.Better.states;
import LLD.ATM.Better.DTO.*;
import LLD.ATM.Better.Enums.ATMState;
import LLD.ATM.Better.apis.*;
import LLD.ATM.Better.models.*;

public class ReadCashWithdrawalDetailsState implements State{
    private final ATM atm;
    private final backendApi backendApi;

    public ReadCashWithdrawalDetailsState(ATM atm, backendApi backendApi) {
        this.atm = atm;
        this.backendApi = backendApi;
    }
    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot initialize transaction while reading cash withdrawal details");
    }

    @Override
    public boolean readCardAndPinDetails(Card card,int Pin) {
        throw new IllegalStateException("Cannot read card and pin details while reading cash withdrawal details");
    }

    @Override
    public boolean readCashWithdrawalDetails(int transactionId, int amount,Card card) {
            boolean isValid = card.getCardManagerService(backendApi).validateCashWithdrawalDetails(transactionId, amount);
            if(isValid) {
                atm.updateState(new DispenseCashState(atm, backendApi, amount));
            }
            else {
                atm.updateState(new EjectingCardState(atm, backendApi));
            }
        return true;
    }

    @Override
    public int dispenseCash(Card card,int transactionId,int amount) {
        throw new IllegalStateException("Cannot dispense cash while reading cash withdrawal details");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        atm.updateState(new ReadyForTransactionState(atm, backendApi));
        return backendApi.cancelTransaction(new cancelTransactionDTO(atm.getAtmId(), transactionId));        
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card while reading cash withdrawal details");
    }

    @Override
    public ATMState getStatus() {
        return ATMState.READ_CASH_WITHDRAWAL_DETAILS;
    }
    
}