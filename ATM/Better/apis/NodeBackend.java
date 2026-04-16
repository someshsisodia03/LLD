package LLD.ATM.Better.apis;
import LLD.ATM.Better.DTO.*;

public class NodeBackend implements backendApi {
    @Override
    public int getTransactionId(createTransactionDTO createTransactionDTO) {
        if(createTransactionDTO.getAtmId() == null || createTransactionDTO.getAtmId().isEmpty()) {
            throw new IllegalArgumentException("ATM ID cannot be null or empty");
        }
        int txnID = (int) (Math.random() * 100000);
        return txnID;
    }
    @Override
    public boolean updateState(updateTransactionDTO updateTransactionDTO) {
        return true;
    }
    @Override
    public boolean validateCardDetails(validateCardDetailsDTO validateCardDetailsDTO) {
        // if(validateCardDetailsDTO.getAtmId() == null || validateCardDetailsDTO.getAtmId().isEmpty()) {
        //     throw new IllegalArgumentException("ATM ID cannot be null or empty");
        // }
        // if(validateCardDetailsDTO.getCardNumber() == null || validateCardDetailsDTO.getCardNumber().isEmpty()) {
        //     throw new IllegalArgumentException("Card number cannot be null or empty");
        // }
        // if(validateCardDetailsDTO.getPin() == null || validateCardDetailsDTO.getPin().isEmpty()) {
        //     throw new IllegalArgumentException("PIN cannot be null or empty");
        // }
        return true;
    }
    @Override
    public boolean cancelTransaction(cancelTransactionDTO cancelTransactionDTO) {
        return true;
    }
    @Override
    public boolean validateCashWithdrawalDetails(validateCashWithdrawalDetailsDTO validateCashWithdrawalDetailsDTO) {
        return true;
    }
    @Override
    public int getATMamount(getATMAmountDTO getATMAmountDTO) {
        return 100000;
    }
}