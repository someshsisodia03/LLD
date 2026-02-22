package LLDPrototypePattern.NaiveSoln;
public class Driver {
    public static void main(String[] args) {
        Email email1 = new Email("sender@example.com", "receiver@example.com", "Subject", "Body");
        Email email2 = new Email(email1);
        System.out.println(email1.getSender() + " " + email2.getSender());
    }
}