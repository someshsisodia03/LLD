package LLD.ATM.Better.states;
import LLD.ATM.Better.Enums.ATMState;
import LLD.ATM.Better.models.Card;
public interface State{
    int initTransaction();
    boolean readCardAndPinDetails(Card card);
    boolean readCashWithdrawalDetails(int transactionId, int amount);
    int dispenseCash(int transactionId);
    void ejectCard();
    ATMState getStatus();

}