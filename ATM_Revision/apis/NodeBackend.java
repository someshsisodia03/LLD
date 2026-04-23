package LLD.ATM_Revision.apis;
import LLD.ATM_Revision.DTO.*;
public class NodeBackend implements Backend {
    @Override
    public int initTransaction(CreateTransactionDTO createTransactionDTO){
        if(createTransactionDTO.getAtmID() <= 0) {
            throw new IllegalArgumentException("ATM ID cannot be null or empty");
        }
        int txnID = (int) (Math.random() * 100000);
        return txnID;
    } 
    @Override
    public boolean updateATMState(UpdateATMStateDTO updateATMStateDTO){
        // Logic to update the state of the ATM in the backend
        // This could involve updating the ATM's status, cash levels, etc. in the database
        return true; // Placeholder return value
    }
    @Override
    public boolean cancelTransaction(CancelTransactionDTO cancelTransactionDTO){
        // Logic to cancel the transaction in the backend
        // This could involve updating the transaction status in the database, releasing any reserved funds, etc.
        return true; // Placeholder return value
    }
    @Override
    public boolean validateCardAndPinDetails(ValidateCardDetailsDTO validateCardDetailsDTO) {
        // Logic to validate the card details and PIN in the backend
        // This could involve checking the card number and PIN against stored values in the database, checking for card expiration, etc.
        return true; // Placeholder return value
    }
    @Override
    public boolean validateCashWithdrawalDetails(ValidateCashWithdrawalDetailsDTO validateCashWithdrawalDetailsDTO) {
        // Logic to validate the cash withdrawal details in the backend
        // This could involve checking the transaction ID, card number, and amount against stored values in the database, checking for sufficient funds, etc.
        return true; // Placeholder return value
    }
    @Override
    public int getATMAmount(GetATMAmountDTO getATMAmountDTO) {
        // Logic to retrieve the current cash amount available in the ATM from the backend
        // This could involve querying the database for the ATM's current cash level based on the ATM ID
        return 10000; // Placeholder return value representing the amount of cash available in the ATM
    }

}