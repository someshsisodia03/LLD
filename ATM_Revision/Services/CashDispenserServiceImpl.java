package LLD.ATM_Revision.Services;
import LLD.ATM_Revision.DTO.*;
import LLD.ATM_Revision.apis.*;
import LLD.ATM_Revision.model.*;
public class CashDispenserServiceImpl implements CashDispenserService {
    private final ATM atm;
    private final Backend backend;

    public CashDispenserServiceImpl(ATM atm, Backend backend) {
        this.atm = atm;
        this.backend = backend;
    }
    @Override
    public int dispenseCash(Card card, int transactionId, int amount) {
        int atmAmount = backend.getATMAmount(new GetATMAmountDTO(atm.getATMId()));
        if(atmAmount < amount) {
            throw new RuntimeException("ATM does not have sufficient amount");
        }
        System.out.println("Dispensing cash: " + amount);
        return amount;

    }
}