package LLD.ATM_Revision.DTO;
public class CreateTransactionDTO {
    private final int atmID;

    public CreateTransactionDTO(int atmID) {
        this.atmID = atmID;
        
    }

    public int getAtmID() {
        return atmID;
    }

}