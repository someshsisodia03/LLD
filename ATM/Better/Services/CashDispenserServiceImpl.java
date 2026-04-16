package LLD.ATM.Better.Services;
import LLD.ATM.Better.DTO.*;
import LLD.ATM.Better.apis.*;
import LLD.ATM.Better.models.*;
public class CashDispenserServiceImpl implements CashDispenserService {
    private final backendApi backendApi;
    public CashDispenserServiceImpl(backendApi backendApi) {
        this.backendApi = backendApi;
    }
    @Override
    public int dispenseCash(ATM atm, int amount) {
        int atmAmount = backendApi.getATMamount(new getATMAmountDTO(atm.getAtmId()));
        if(atmAmount < amount) {
            throw new RuntimeException("ATM does not have sufficient amount");
        }
        System.out.println("Dispensing cash: " + amount);
        return amount;
    }
}