package LLD.ATM.Better.Services;
public class CreditCardManagerService implements CardManagerService{
    @Override
    public boolean validateCardDetails(String cardNumber, String pin, String atmId) {
        return true;
    }

    @Override
    public boolean validateCardWithdrawalDetails(int transactionId, int amount) {
        return true;
    }

    @Override
    public boolean doDispenseCash(int transactionId) {
        return true;
    }
}