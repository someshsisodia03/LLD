package LLD.ATM.Better;
import LLD.ATM.Better.Enums.CardType;
import LLD.ATM.Better.apis.NodeBackend;
import LLD.ATM.Better.models.*;
import LLD.ATM.Better.states.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("ATM Machine");
        ATM atm = new ATM("ATM001");
        Card card = new Card("1234-5678-9012-3456", "1234", "John Doe", CardType.DEBIT, "Bank A");
        State state = new ReadyForTransactionState(atm, new NodeBackend());
        int transactionId = state.initTransaction();
        // System.out.println("Transaction initiated with ID: " + transactionId);
        // System.out.println("Current status: " + atm.getState().getStatus());
        atm.getState().readCardAndPinDetails(card, transactionId);
        atm.getState().readCashWithdrawalDetails(transactionId, 500, card);
        atm.getState().dispenseCash(card, transactionId, 500);
    }
}