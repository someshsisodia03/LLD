package LLD.ATM_Revision.DTO;
public class ValidateCashWithdrawalDetailsDTO {
    private final int transactionId;
    private final int amount;
    public ValidateCashWithdrawalDetailsDTO(int transactionId, int amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }
    public int getTransactionId() {
        return transactionId;
    }
    public int getAmount() {
        return amount;
    }
}