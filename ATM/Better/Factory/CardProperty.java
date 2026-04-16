package LLD.ATM.Better.Factory;
import LLD.ATM.Better.Enums.*;
import LLD.ATM.Better.Services.*;
import LLD.ATM.Better.apis.*;
public class CardProperty{
    private final backendApi backendApi;
    public CardProperty(backendApi backendApi) {
        this.backendApi = backendApi;
    }

    public CardManagerService getCardManagerService(CardType cardType) {
        return new CardFactory(backendApi).getCardManagerService(cardType);    
    }
}