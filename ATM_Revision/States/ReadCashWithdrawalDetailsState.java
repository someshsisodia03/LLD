package LLD.ATM_Revision.States;
import LLD.ATM_Revision.Enums.*;
import LLD.ATM_Revision.apis.*;
import LLD.ATM_Revision.model.*;
public class ReadCashWithdrawalDetailsState implements State {
    private final ATM atm;
    private final Backend backend;

    public ReadCashWithdrawalDetailsState(ATM atm, Backend backend) {
        this.atm = atm;
        this.backend = backend;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot initiate transaction while reading cash withdrawal details");
    }
    @Override
    public boolean readCardAndPinDetails(Card card, int Pin) {
        throw new IllegalStateException("Cannot read card and pin details while reading cash withdrawal details");
    }
    @Override
    public boolean readCashWithdrawalDetails(int transactionId, int amount, Card card) {
        
        boolean isValid = card.getCardManagerService(backend).validateCashWithdrawal(transactionId, amount);
        if (isValid) {
            atm.updateState(new DispenseCashState(atm, backend));
        } else {
            atm.updateState(new EjectingCardState(atm, backend));
        }
        return isValid;
    }
    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel transaction while reading cash withdrawal details");
    }
    @Override
    public int dispenseCash(Card card, int transactionId, int amount) {
        throw new IllegalStateException("Cannot dispense cash while reading cash withdrawal details");
    }
    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card while reading cash withdrawal details");
    }
    @Override
    public ATMState getStatus() {
        return ATMState.CASH_WITHDRAWAL_VALIDATION;
    }

}