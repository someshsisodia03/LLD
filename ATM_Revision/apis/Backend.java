package LLD.ATM_Revision.apis;
import LLD.ATM_Revision.DTO.*;
public interface Backend {
    int initTransaction(CreateTransactionDTO createTransactionDTO);
    boolean updateATMState(UpdateATMStateDTO updateATMStateDTO);
    boolean cancelTransaction(CancelTransactionDTO cancelTransactionDTO);
    boolean validateCardAndPinDetails(ValidateCardDetailsDTO validateCardDetailsDTO);
    boolean validateCashWithdrawalDetails(ValidateCashWithdrawalDetailsDTO validateCashWithdrawalDetailsDTO);
    int getATMAmount(GetATMAmountDTO getATMAmountDTO);
}