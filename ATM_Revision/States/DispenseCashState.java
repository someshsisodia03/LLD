package LLD.ATM_Revision.States;
import LLD.ATM_Revision.Enums.*;
import LLD.ATM_Revision.apis.*;
import LLD.ATM_Revision.model.*;
public class DispenseCashState implements State {
    private final ATM atm;
    private final Backend backend;

    public DispenseCashState(ATM atm, Backend backend) {
        this.atm = atm;
        this.backend = backend;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot initiate transaction while dispensing cash");
    }
    @Override
    public boolean readCardAndPinDetails(Card card, int Pin) {
        throw new IllegalStateException("Cannot read card and pin details while dispensing cash");
    }
    @Override
    public boolean readCashWithdrawalDetails(int transactionId, int amount, Card card) {
        throw new IllegalStateException("Cannot read cash withdrawal details while dispensing cash");
    }
    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel transaction while dispensing cash");
    }
    @Override
    public int dispenseCash(Card card, int transactionId, int amount) {
        boolean isTransactionSuccess = card.getCardManagerService(backend).doTransaction(card,transactionId, amount);
        if(isTransactionSuccess){
            
        }
        else{
            atm.updateState(new EjectingCardState(atm,backend));
        }
        return amount;
    }
    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card while dispensing cash");
    }
    @Override
    public ATMState getStatus() {
        return ATMState.DISPENSE_CASH;
    }

}