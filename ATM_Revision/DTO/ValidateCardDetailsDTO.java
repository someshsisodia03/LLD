package LLD.ATM_Revision.DTO;
public class ValidateCardDetailsDTO {
    private final int atmId;
    private final String cardNumber;
    private final String pin;
    private final int userPin;
    public ValidateCardDetailsDTO(int atmId, String cardNumber, String pin, int userPin) {
        this.atmId = atmId;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.userPin = userPin;
    }
    public int getAtmId() {
        return atmId;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public String getPin() {
        return pin;
    }
    public int getUserPin() {
        return userPin;
    }
}