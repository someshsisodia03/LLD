package LLD.ATM_Revision.DTO;
import LLD.ATM_Revision.Enums.*;

public class UpdateATMStateDTO {
    private final int atmID;
    private final ATMState atmState;
    public UpdateATMStateDTO(int atmID, ATMState atmState) {
        this.atmID = atmID;
        this.atmState = atmState;
    }

    public int getAtmID() {
        return atmID;
    }

    public ATMState getAtmState() {
        return atmState;
    }
}