package LLD.ATM.Better.Services;
import LLD.ATM.Better.models.*;
public class CreditCardManagerService implements CardManagerService{
    @Override
    public boolean validateCardDetails(String cardNumber, String pin, String atmId,int Pin) {
        return true;
    }

    @Override
    public boolean validateCashWithdrawalDetails(int transactionId, int amount) {
        return true;
    }

    @Override
    public boolean doTransaction(Card card,int transactionId,int amount) {
        return true;
    }
}