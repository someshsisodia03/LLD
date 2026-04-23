package LLD.ATM_Revision.States;
import LLD.ATM_Revision.Enums.*;
import LLD.ATM_Revision.model.*;
public interface State {
    int initTransaction();
    boolean readCardAndPinDetails(Card card,int Pin);
    boolean readCashWithdrawalDetails(int transactionId, int amount,Card card);
    int dispenseCash(Card card,int transactionId,int amount);
    void ejectCard();
    boolean cancelTransaction(int transactionId);
    ATMState getStatus();
}