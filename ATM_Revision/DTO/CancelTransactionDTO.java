package LLD.ATM_Revision.DTO;
public class CancelTransactionDTO {
    private final int transactionId;

    public CancelTransactionDTO(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getTransactionId() {
        return transactionId;
    }
}