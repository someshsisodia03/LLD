package LLD.ATM.Better.DTO;
public class validateCardDetailsDTO {
    private final String atmId;
    private final String cardNumber;
    private final String pin;

    public validateCardDetailsDTO(String atmId, String cardNumber, String pin) {
        this.atmId = atmId;
        this.cardNumber = cardNumber;
        this.pin = pin;
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
}