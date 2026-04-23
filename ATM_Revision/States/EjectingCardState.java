package LLD.ATM_Revision.States;
import LLD.ATM_Revision.Enums.*;
import LLD.ATM_Revision.apis.*;
import LLD.ATM_Revision.model.*;
public class EjectingCardState implements State {
    private final ATM atm;
    private final Backend backend;

    public EjectingCardState(ATM atm, Backend backend) {
        this.atm = atm;
        this.backend = backend;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot initiate transaction while ejecting card");
    }
    @Override
    public boolean readCardAndPinDetails(Card card, int Pin) {
        throw new IllegalStateException("Cannot read card and pin details while ejecting card");
    }
    @Override
    public boolean readCashWithdrawalDetails(int transactionId, int amount, Card card) {
        throw new IllegalStateException("Cannot read cash withdrawal details while ejecting card"); 
    }
    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel transaction while ejecting card");
    }
    @Override
    public int dispenseCash(Card card, int transactionId, int amount) {
        throw new IllegalStateException("Cannot dispense cash while ejecting card");
    }
    @Override
    public void ejectCard() {
        // Logic to eject the card from the ATM
        // This can include hardware interaction to physically eject the card
        // For simulation purposes, we can just print a message
        System.out.println("Ejecting card...");
        // After ejecting the card, transition back to ReadyForTransactionState
        atm.updateState(new ReadyForTransactionState(atm, backend));
    }
    @Override
    public ATMState getStatus() {
        return ATMState.EJECTING_CARD_STATE;
    }

}