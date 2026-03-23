package LLD.PrototypePattern.ImprovedSoln;
public class Driver {
    public static void main(String[] args) {
        Email e = new Email("sender@example.com", "receiver@example.com", "Subject", "Body");
        PremiumEmail pe = new PremiumEmail("sender@example.com", "receiver@example.com", "Subject", "Body","Priority High","Confidential");
        Email e1 = e.copy();
        PremiumEmail pe1 = pe.copy();
        e1.displayEmail();
        pe1.displayEmail();
    }
}