package LLD.ATM.Better.states;
import LLD.ATM.Better.DTO.createTransactionDTO;
import LLD.ATM.Better.Enums.ATMState;
import LLD.ATM.Better.apis.backendApi;
import LLD.ATM.Better.models.ATM;
import LLD.ATM.Better.models.Card;

public class ReadyForTransactionState implements State{
    private final ATM atm;
    private final backendApi backendApi;

    public ReadyForTransactionState(ATM atm, backendApi backendApi) {
        this.atm = atm;
        this.backendApi = backendApi;
    }

    @Override
    public int initTransaction() {
        int transactionId = backendApi.getTransactionId(new createTransactionDTO(atm.getAtmId()));
        if(transactionId <= 0) {
            throw new IllegalStateException("Failed to initiate transaction. Invalid transaction ID received from backend.");
        }
        atm.updateState(new ReadCardAndPinDetailsState(this.atm, this.backendApi));
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