public class ATM {

    // Start a transaction and return a transaction ID
    public int startTransaction() {
        int transactionId = generateTransactionId();
        System.out.println("Transaction started with ID: " + transactionId);
        return transactionId;
    }

    // Cancel a transaction based on the transaction ID
    public boolean cancelTransaction(int transactionId) {
        System.out.println("Transaction with ID: " + transactionId + " canceled.");
        return true; // Return true if cancellation is successful
    }

    // Read card details and validate them
    public boolean readCard(String cardType, long cardNumber, int pin) {
        System.out.println("Validating card: " + cardType + ", Card Number: " + cardNumber);

        boolean isValid = validateCardDetails(cardType, cardNumber, pin);

        if (isValid) {
            System.out.println("Card is valid.");
        } else {
            System.out.println("Invalid card details.");
        }

        return isValid;
    }

    // Withdraw a certain amount
    public boolean withdrawAmount(int transactionId, double amount) {
        System.out.println("Processing withdrawal of amount: " + amount + " for transaction ID: " + transactionId);

        boolean canWithdraw = checkWithdrawalLimit(transactionId, amount);

        if (canWithdraw) {
            System.out.println("Withdrawal approved.");
        } else {
            System.out.println("Withdrawal denied.");
        }

        return canWithdraw;
    }

    // Dispense cash
    public void dispenseCash(double amount) {
        System.out.println("Dispensing cash: " + amount);
        deductCashFromATM(amount);
    }

    // Eject the card
    public void ejectCard() {
        System.out.println("Ejecting card...");
    }

    // ---------------- Private Helper Methods ----------------

    private int generateTransactionId() {
        return (int) (Math.random() * 100000);
    }

    private boolean validateCardDetails(String cardType, long cardNumber, int pin) {
        // Simulated validation
        return true;
    }

    private boolean checkWithdrawalLimit(int transactionId, double amount) {
        // Assume max limit is 1000
        return amount <= 1000;
    }

    private void deductCashFromATM(double amount) {
        System.out.println("ATM balance updated after dispensing: " + amount);
    }

    // ---------------- Main Method ----------------

    public static void main(String[] args) {
        ATM atm = new ATM();

        int transactionId = atm.startTransaction();

        boolean cardValid = atm.readCard("VISA", 1234567890123456L, 1234);

        if (cardValid) {
            boolean canWithdraw = atm.withdrawAmount(transactionId, 500);

            if (canWithdraw) {
                atm.dispenseCash(500);
            } else {
                atm.cancelTransaction(transactionId);
            }
        } else {
            atm.ejectCard();
        }
    }
}