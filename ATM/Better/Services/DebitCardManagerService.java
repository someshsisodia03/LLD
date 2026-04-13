package LLD.ATM.Better.Services;

import LLD.ATM.Better.DTO.validateCardDetailsDTO;
import LLD.ATM.Better.apis.backendApi;


public class DebitCardManagerService implements CardManagerService{
    private final backendApi backendApi;
    public DebitCardManagerService(backendApi backendApi) {
        this.backendApi = backendApi;
    }
    @Override
    public boolean validateCardDetails(String cardNumber, String pin, String atmId) {
        return backendApi.validateCardDetails(new validateCardDetailsDTO(atmId, cardNumber, pin));
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