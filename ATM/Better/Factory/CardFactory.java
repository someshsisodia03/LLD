package LLD.ATM.Better.Factory;
import LLD.ATM.Better.Enums.*;
import LLD.ATM.Better.Services.*;
import LLD.ATM.Better.apis.*;

public class CardFactory {
    private final backendApi backendApi;
    public CardFactory(backendApi backendApi) {
        this.backendApi = backendApi;
    }
    public CardManagerService getCardManagerService(CardType cardType) {
        if(cardType == CardType.DEBIT) {
            return new DebitCardManagerService(backendApi);
        }
        else if(cardType == CardType.CREDIT) {
            return new CreditCardManagerService();
        }
        else {
            throw new IllegalArgumentException("Invalid card type");
        }
    }
}