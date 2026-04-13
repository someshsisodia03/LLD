package LLD.ATM.Better.states;
import LLD.ATM.Better.Enums.ATMState;
import LLD.ATM.Better.apis.*;
import LLD.ATM.Better.models.ATM;
import LLD.ATM.Better.models.Card;
import LLD.ATM.Better.Services.CardManagerService;


public class ReadCardAndPinDetailsState implements State{
    private ATM atm;
    private backendApi backendApi;
    CardManagerService cardManagerService;

    public ReadCardAndPinDetailsState(ATM atm, backendApi backendApi, CardManagerService cardManagerService) {
        this.atm = atm;
        this.backendApi = backendApi;
        this.cardManagerService = cardManagerService;
    }
    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot initialize transaction while reading card and pin details");
    }

    @Override
    public boolean readCardAndPinDetails(Card card) {
        boolean isValid = cardManagerService.validateCardDetails(card.getCardNumber(), card.getPin(), atm.getAtmId());
        atm.updateState(new ReadCashWithdrawalDetailsState());
        return true;

    }

    @Override
    public boolean readCashWithdrawalDetails(int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdrawal details while reading card and pin details");
    }

    @Override
    public int dispenseCash(int transactionId) {
        throw new IllegalStateException("Cannot dispense cash while reading card and pin details");
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