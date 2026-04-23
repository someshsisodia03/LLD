package LLD.ATM_Revision.DTO;
public class GetATMAmountDTO {
    private int atmId;

    public GetATMAmountDTO(int atmId) {
        this.atmId = atmId;
    }

    public int getAtmId() {
        return atmId;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }
}