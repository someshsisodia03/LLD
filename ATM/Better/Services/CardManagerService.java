package LLD.ATM.Better.Services;
import LLD.ATM.Better.models.*;
public interface CardManagerService {
    boolean validateCardDetails(String cardNumber, String pin, String atmId,int Pin);
    boolean validateCashWithdrawalDetails(int transactionId, int amount);
    boolean doTransaction(Card card,int transactionId,int amount);
}