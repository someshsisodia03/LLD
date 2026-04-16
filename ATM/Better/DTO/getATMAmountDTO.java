package LLD.ATM.Better.DTO;
public class getATMAmountDTO {
    private final String atmID;

    public getATMAmountDTO(String atmID) {
        this.atmID = atmID;
    }

    public String getAtmID() {
        return atmID;
    }

}       