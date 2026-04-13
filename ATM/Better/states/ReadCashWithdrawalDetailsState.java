package LLD.ATM.Better.states;
import LLD.ATM.Better.Enums.ATMState;
import LLD.ATM.Better.models.Card;

public class ReadCashWithdrawalDetailsState implements State{

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot initialize transaction while reading cash withdrawal details");
    }

    @Override
    public boolean readCardAndPinDetails(Card card) {
        throw new IllegalStateException("Cannot read card and pin details while reading cash withdrawal details");
    }

    @Override
    public boolean readCashWithdrawalDetails(int transactionId, int amount) {
        // throw new IllegalStateException("Cannot read cash withdrawal details while in this state");
        // atm.updateState(new DispenseCashState());
        return true;
    }

    @Override
    public int dispenseCash(int transactionId) {
        throw new IllegalStateException("Cannot dispense cash while reading cash withdrawal details");
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