package LLD.ATM.Better.DTO;
public class validateCashWithdrawalDetailsDTO {
    private final int transactionId;
    private final int amount;

    public validateCashWithdrawalDetailsDTO(int transactionId, int amount) {
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