package LLD.ATM_Revision.Services;
import LLD.ATM_Revision.model.*;
public interface CashDispenserService {
    int dispenseCash(Card card, int transactionId, int amount);
}