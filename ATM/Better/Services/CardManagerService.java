package LLD.ATM.Better.Services;
public interface CardManagerService {
    boolean validateCardDetails(String cardNumber, String pin, String atmId);
    boolean validateCardWithdrawalDetails(int transactionId, int amount);
    boolean doDispenseCash(int transactionId);
}