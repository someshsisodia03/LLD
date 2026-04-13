package LLD.ATM.Better.models;
import LLD.ATM.Better.Enums.CardType;

public class VisaDebitCard extends Card implements Visa, DebitCard {
    public VisaDebitCard(String cardNumber, String pin,CardType cardType, String cardHolderName, String bankName) {
        super(cardNumber, pin, cardHolderName, cardType, bankName);
    }

    @Override
    public void enterPinDetails() {
        connectToVisaNetwork();
        System.out.println("Entering PIN details for Visa Debit Card...");
    }

    @Override
    public void connectToVisaNetwork() {
        System.out.println("Connecting to Visa Network...");
    }


}