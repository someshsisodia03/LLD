package LLD.ATM_Revision.Services;
import LLD.ATM_Revision.model.*;
public interface CardManagerService {
    boolean validateCardDetails(String cardNumber, String pin, int atmId,int Pin);
    boolean validateCashWithdrawalDetails(int transactionId, int amount);
    boolean doTransaction(Card card,int transactionId,int amount);
}