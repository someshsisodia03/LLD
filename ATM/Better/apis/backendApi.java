package LLD.ATM.Better.apis;
import LLD.ATM.Better.DTO.*;
public interface backendApi {
    int getTransactionId(createTransactionDTO createTransactionDTO);
    boolean updateState(updateTransactionDTO updateTransactionDTO);
    boolean validateCardDetails(validateCardDetailsDTO validateCardDetailsDTO);
    boolean cancelTransaction(cancelTransactionDTO cancelTransactionDTO);
    boolean validateCashWithdrawalDetails(validateCashWithdrawalDetailsDTO validateCashWithdrawalDetailsDTO);
    int getATMamount(getATMAmountDTO getATMAmountDTO);
}