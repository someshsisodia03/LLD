package LLD.ATM.Better.states;
import LLD.ATM.Better.Enums.*;
import LLD.ATM.Better.apis.*;
import LLD.ATM.Better.models.*;

public class EjectingCardState implements State{
    private final ATM atm;
    private final backendApi backendApi;

    public EjectingCardState(ATM atm, backendApi backendApi) {
        this.atm = atm;
        this.backendApi = backendApi;
    }
    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot initialize transaction while ejecting card");
    }

    @Override
    public boolean readCardAndPinDetails(Card card,int Pin) {
        throw new IllegalStateException("Cannot read card and pin details while ejecting card");
    }

    @Override
    public boolean readCashWithdrawalDetails(int transactionId, int amount,Card card) {
        throw new IllegalStateException("Cannot read cash withdrawal details while ejecting card");
    }

    @Override
    public int dispenseCash(Card card, int transactionId, int amount) {
        throw new IllegalStateException("Cannot dispense cash while ejecting card");
    }
    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel transaction while ejecting card");        
    }

    @Override
    public void ejectCard() {
        System.out.println("Ejecting card...Please take your card.");
        atm.updateState(new ReadyForTransactionState(atm, backendApi));
    }

    @Override
    public ATMState getStatus() {
        return ATMState.EJECT_CARD;
    }
}