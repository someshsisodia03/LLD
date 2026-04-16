package LLD.ATM.Better.DTO;
public class validateCardDetailsDTO {
    private final String atmId;
    private final String cardNumber;
    private final String pin;
    private final int userSpecifiedPin;

    public validateCardDetailsDTO(String atmId, String cardNumber, String pin,int  userSpecifiedPin) {
        this.atmId = atmId;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.userSpecifiedPin = userSpecifiedPin;

    }

    public String getAtmId() {
        return atmId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }
    public int getUserSpecifiedPin() {
        return userSpecifiedPin;
    }
}