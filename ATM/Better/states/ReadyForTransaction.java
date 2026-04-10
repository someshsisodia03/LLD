package LLD.ATM.Better.states;
import LLD.ATM.Better.Enums.ATMState;
import LLD.ATM.Better.apis.backendApi;
import LLD.ATM.Better.models.ATM;
import LLD.ATM.Better.models.Card;

public class ReadyForTransaction implements State{
    private final ATM atm;
    private final backendApi backendApi;

    ReadyForTransaction(ATM atm, backendApi backendApi) {
        this.atm = atm;
        this.backendApi = backendApi;
    }

    @Override
    public int initTransaction() {
        int transactionId = backendApi.getTransactionId(atm.getAtmId());
        return transactionId;
    }

    @Override
    public boolean readCardAndPinDetails(Card card) {
        throw new IllegalStateException("Cannot read card and pin details before transaction is initiated");
    }

    @Override
        public boolean readCashWithdrawalDetails(int transactionId, int amount) {
        
            throw new IllegalStateException("Cannot read cash withdrawal details before card details are read");

    }

    @Override
    public int dispenseCash(int transactionId) {
        throw new IllegalStateException("Cannot dispense cash before cash withdrawal details are read");
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