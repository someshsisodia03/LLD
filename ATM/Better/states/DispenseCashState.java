package LLD.ATM.Better.states;
import LLD.ATM.Better.Enums.*;
import LLD.ATM.Better.Services.*;
import LLD.ATM.Better.apis.*;
import LLD.ATM.Better.models.*;

public class DispenseCashState implements State{
        private final ATM atm;
        private final backendApi backendApi;
        private final int amount;
        private final CashDispenserService cashDispenserService;

    public DispenseCashState(ATM atm, backendApi backendApi, int amount) {
        this.atm = atm;
        this.backendApi = backendApi;
        this.amount = amount;
        cashDispenserService = new CashDispenserServiceImpl(backendApi);
    }
    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot initialize transaction while dispensing cash");
    }

    @Override
    public boolean readCardAndPinDetails(Card card,int Pin) {
        throw new IllegalStateException("Cannot read card and pin details while dispensing cash");
    }

    @Override
    public boolean readCashWithdrawalDetails(int transactionId, int amount,Card card) {
        throw new IllegalStateException("Cannot read cash withdrawal details while dispensing cash");
    }

    @Override
    public int dispenseCash(Card card, int transactionId, int amount) {
        boolean isTransactionSuccessful = card.getCardManagerService(backendApi).doTransaction(card, transactionId, amount);
        atm.updateState(new EjectingCardState(atm, backendApi));
        
        if(isTransactionSuccessful) {
            //what is dispensed amount?
            //Assuming the requested amount is dispensed. In real scenario, the cash dispenser might not be able to dispense the exact amount due to various reasons like cash availability, denomination issues etc. In such cases, the actual dispensed amount should be returned by the cash dispenser service.
            //but when the transaction is successful then why their isneed to call cash dispenser service again? cant we directly return the amount?
            //In real scenario, the cash dispenser service should be called to dispense cash and it should return the actual dispensed amount. This is important because there might be cases where the requested amount cannot be dispensed due to various reasons like cash availability, denomination issues etc. So, to make it more realistic, we should call the cash dispenser service to get the actual dispensed amount.
            // but the transaction is success ful it means there are no such cases?
            //Not necessarily. A transaction can be successful in terms of authorization and debiting the amount from the user's account, but there can still be issues with dispensing cash. For example, the cash dispenser might run out of cash after the transaction is authorized, or there might be a mechanical issue that prevents the cash from being dispensed. In such cases, the transaction would be successful from a banking perspective, but the user would not receive the cash. Therefore, it's important to call the cash dispenser service to get the actual dispensed amount and handle any discrepancies accordingly.
            //Explain in simple words?
            //Sure! When a user requests to withdraw cash from an ATM, the bank's system checks if the user has enough balance and if the transaction can be authorized. If everything is fine, the transaction is marked as successful. However, even if the transaction is successful, there can still be issues with the ATM's cash dispenser. For example, the ATM might run out of cash or there might be a mechanical problem that prevents the cash from being dispensed. So, just because the transaction is successful doesn't necessarily mean that the user will receive the cash. That's why it's important to call the cash dispenser service to find out how much cash was actually dispensed and handle any issues that might arise from discrepancies between the requested amount and the dispensed amount.
        
            int dispensedAmount = cashDispenserService.dispenseCash(atm, amount);
            return dispensedAmount;
        }
        else {
            throw new IllegalStateException("Failed to dispense cash. Transaction is cancelled.");
        }
    }
    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel transaction while dispensing cash");        
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card while dispensing cash");
    }

    @Override
    public ATMState getStatus() {
        return ATMState.DISPENSE_CASH;
    }

}