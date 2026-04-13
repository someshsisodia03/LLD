package LLD.ATM.Better.models;
import LLD.ATM.Better.Enums.CardType;

public class VisaCreditCard extends Card implements Visa, CreditCard {
    public VisaCreditCard(String cardNumber, String pin,CardType cardType, String cardHolderName, String bankName) {
        super(cardNumber, pin, cardHolderName, cardType, bankName);
    }

    @Override
    public void enterPinDetails() {
        connectToVisaNetwork();
        System.out.println("Entering PIN details for Visa Credit Card...");
    }

    @Override
    public void connectToVisaNetwork() {
        System.out.println("Connecting to Visa Network...");
    }


}