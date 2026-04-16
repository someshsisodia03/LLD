package LLD.ATM.Better.states;
import LLD.ATM.Better.Enums.ATMState;
import LLD.ATM.Better.models.Card;
public interface State{
    int initTransaction();
    boolean readCardAndPinDetails(Card card,int Pin);
    boolean readCashWithdrawalDetails(int transactionId, int amount,Card card);
    int dispenseCash(Card card,int transactionId,int amount);
    boolean cancelTransaction(int transactionId);
    void ejectCard();
    ATMState getStatus();

}