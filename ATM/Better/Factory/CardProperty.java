package LLD.ATM.Better.Factory;
import LLD.ATM.Better.Services.*;
import LLD.ATM.Better.apis.*;
import LLD.ATM.Better.models.*;
public class CardProperty{
    private final backendApi backendApi;
    public CardProperty(backendApi backendApi) {
        this.backendApi = backendApi;
    }

    public CardManagerService getCardManagerService(Card card) {
        return new CardFactory(backendApi).getCardManagerService(card);
    }
}