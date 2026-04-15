package LLD.ATM.Better.Factory;
import LLD.ATM.Better.Services.*;
import LLD.ATM.Better.apis.*;
import LLD.ATM.Better.models.*;

public class CardFactory {
    private final backendApi backendApi;
    public CardFactory(backendApi backendApi) {
        this.backendApi = backendApi;
    }
    public CardManagerService getCardManagerService(Card card) {
        if(card.getCardType().equals("DEBIT")) {
            return new DebitCardManagerService(backendApi);
        }
        else if(card.getCardType().equals("CREDIT")) {
            return new CreditCardManagerService();
        }
        else {
            throw new IllegalArgumentException("Invalid card type");
        }
    }
}