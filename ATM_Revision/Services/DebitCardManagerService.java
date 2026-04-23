package LLD.ATM_Revision.Services;
import LLD.ATM_Revision.DTO.*;
import LLD.ATM_Revision.apis.*;
import LLD.ATM_Revision.model.*;

public class DebitCardManagerService implements CardManagerService{
    private final Backend backend;
    public DebitCardManagerService(Backend backend) {
        this.backend = backend;
    }
    @Override
    public boolean validateCardDetails(String cardNumber, String pin, int atmId,int Pin) {
        return backend.validateCardAndPinDetails(new ValidateCardDetailsDTO(atmId, cardNumber, pin,Pin));
    }

    @Override
    public boolean validateCashWithdrawalDetails(int transactionId, int amount) {
        return backend.validateCashWithdrawalDetails(new ValidateCashWithdrawalDetailsDTO(transactionId, amount));
    }

    @Override
    public boolean doTransaction(Card card,int transactionId,int amount) {
        return true;
    }
}