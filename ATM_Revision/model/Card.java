package LLD.ATM_Revision.model;
import LLD.ATM_Revision.Enums.*;
import LLD.ATM_Revision.Services.*;
import LLD.ATM_Revision.apis.*;
import LLD.ATM_Revision.factories.*;
public class Card {
    private final String cardNumber;
    private final String cardHolderName;
    private final String expiryDate;
    private final CardType cardType;
    private final String CardPin;

    public Card(String cardNumber, String cardHolderName, String expiryDate, String CardPin, CardType cardType) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cardType = cardType;
        this.CardPin = CardPin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public CardType getCardType() {
        return cardType;
    }
    public String getCardPin() {
        return CardPin;
    }
    public CardManagerService getCardManagerService(Backend backend) {
        return new CardFactory(backend).getCardManagerService(this.getCardType());
    }
}