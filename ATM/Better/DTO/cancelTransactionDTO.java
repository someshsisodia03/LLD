package LLD.ATM.Better.DTO;
public class cancelTransactionDTO {
    private final String atmId;
    private final int transactionId;

    public cancelTransactionDTO(String atmId, int transactionId) {
        this.atmId = atmId;
        this.transactionId = transactionId;
    }

    public String getAtmId() {
        return atmId;
    }

    public int getTransactionId() {
        return transactionId;
    }
}