package LLD.ATM.Better.Services;
import LLD.ATM.Better.DTO.*;
import LLD.ATM.Better.apis.backendApi;
import LLD.ATM.Better.models.*;


public class DebitCardManagerService implements CardManagerService{
    private final backendApi backendApi;
    public DebitCardManagerService(backendApi backendApi) {
        this.backendApi = backendApi;
    }
    @Override
    public boolean validateCardDetails(String cardNumber, String pin, String atmId,int Pin) {
        return backendApi.validateCardDetails(new validateCardDetailsDTO(atmId, cardNumber, pin,Pin));
    }

    @Override
    public boolean validateCashWithdrawalDetails(int transactionId, int amount) {
        return backendApi.validateCashWithdrawalDetails(new validateCashWithdrawalDetailsDTO(transactionId, amount));
    }

    @Override
    public boolean doTransaction(Card card,int transactionId,int amount) {
        return true;
    }
}