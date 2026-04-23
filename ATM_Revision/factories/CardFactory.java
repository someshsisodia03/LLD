package LLD.ATM_Revision.factories;
import LLD.ATM_Revision.Enums.*;
import LLD.ATM_Revision.Services.*;
import LLD.ATM_Revision.apis.Backend;
public class CardFactory {
    private final Backend backend;
    public CardFactory(Backend backend) {
        this.backend = backend;
    }
    public CardManagerService getCardManagerService(CardType cardType) {
        switch (cardType) {
            case DEBIT:
                return new DebitCardManagerService(backend);
            case CREDIT:
                return new CreditCardManagerService();
            default:
                throw new IllegalArgumentException("Invalid card type: " + cardType);
        }
    }
}