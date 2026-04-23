package LLD.ATM_Revision.Services;
import LLD.ATM_Revision.model.*;
public class CreditCardManagerService implements CardManagerService {
    @Override
    public boolean validateCardDetails(String cardNumber, String pin, int atmId,int Pin) {
        // Implement validation logic for credit card details
        return true; // Placeholder return value
    }

    @Override
    public boolean validateCashWithdrawalDetails(int transactionId, int amount) {
        // Implement validation logic for cash withdrawal details
        return true; // Placeholder return value
    }

    @Override
    public boolean doTransaction(Card card,int transactionId,int amount) {
        // Implement transaction logic for debit card
        return true; // Placeholder return value
    }
}