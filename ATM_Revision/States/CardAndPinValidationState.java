package LLD.ATM_Revision.States;
import LLD.ATM_Revision.DTO.*;
import LLD.ATM_Revision.Enums.*;
import LLD.ATM_Revision.apis.*;
import LLD.ATM_Revision.model.*;

public class CardAndPinValidationState implements State {
    private final ATM atm;
    private final Backend backend;

    public CardAndPinValidationState(ATM atm, Backend backend) {
        this.atm = atm;
        this.backend = backend;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Transaction is already initiated. Cannot initiate another transaction.");
    }
    @Override
    public boolean readCardAndPinDetails(Card card, int Pin) {
        boolean isValid = card.getCardManagerService(backend).validateCardDetails(card.getCardNumber(), card.getCardPin(), atm.getATMId(), Pin);
        if(isValid){
            atm.updateState(new ReadCashWithdrawalDetailsState(atm, backend));
        } 
        else {
            atm.updateState(new EjectingCardState(atm, backend));
        }
        return isValid;
    }
    @Override
    public boolean readCashWithdrawalDetails(int transactionId, int amount, Card card) {
        throw new IllegalStateException("Cannot read cash withdrawal details before card details are read"); 
    }
    @Override
    public boolean cancelTransaction(int transactionId) {
        boolean isCancel = backend.cancelTransaction(new CancelTransactionDTO(transactionId));
        
        if(isCancel) atm.updateState(new ReadyForTransactionState(atm, backend));
        else throw new IllegalStateException("Transaction cannot be cancelled at the moment. Please try again later.");
        return isCancel;
    }
    @Override
    public int dispenseCash(Card card, int transactionId, int amount) {
        throw new IllegalStateException("Cannot dispense cash before cash withdrawal details are validated");
    }
    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card before transaction is initiated"); 
    }
    @Override
    public ATMState getStatus() {
        return ATMState.READ_CARD_AND_PIN_VALIDATION_STATE;
    }

}