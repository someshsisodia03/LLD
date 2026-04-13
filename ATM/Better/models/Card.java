package LLD.ATM.Better.models;
import LLD.ATM.Better.Enums.CardType;
public class Card {
    private final String cardNumber;
    private final String pin;
    private final String cardHolderName;
    private final CardType cardType;
    private final String bankName;

    public Card(String cardNumber, String pin, String cardHolderName, CardType cardType, String bankName) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
        this.bankName = bankName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }
    public String getCardHolderName() {
        return cardHolderName;
    }
    public CardType getCardType() {
        return cardType;
    }
    public String getBankName() {
        return bankName;
    }
}