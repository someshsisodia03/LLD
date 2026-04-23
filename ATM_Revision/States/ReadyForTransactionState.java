package LLD.ATM_Revision.States;
import LLD.ATM_Revision.DTO.*;
import LLD.ATM_Revision.Enums.*;
import LLD.ATM_Revision.apis.*;
import LLD.ATM_Revision.model.*;
public class ReadyForTransactionState implements State {
    private final ATM atm;
    private final Backend backend;
    public ReadyForTransactionState(ATM atm, Backend backend) {
        this.atm = atm;
        this.backend = backend;
    }
    @Override
    public int initTransaction() {
        int transactionId = backend.initTransaction(new CreateTransactionDTO(atm.getATMId()));
        if(transactionId == -1) {
            throw new IllegalStateException("Transaction cannot be initiated at the moment. Please try again later.");
        }
        atm.updateState(new CardAndPinValidationState(atm, backend));
        return transactionId;
    }

    @Override
    public boolean readCardAndPinDetails(Card card,int Pin) {
        throw new IllegalStateException("Cannot read card and pin details before transaction is initiated");
    }

    @Override
        public boolean readCashWithdrawalDetails(int transactionId, int amount,Card card) {
        
            throw new IllegalStateException("Cannot read cash withdrawal details before card details are read");

    }

    @Override
    public int dispenseCash(Card card,int transactionId,int amount) {
        throw new IllegalStateException("Cannot dispense cash before cash withdrawal details are read");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel transaction before transaction is initiated");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card before transaction is initiated");
    }

    @Override
    public ATMState getStatus() {
        return ATMState.READY_FOR_TRANSACTION;
    }
}