package LLD.PrototypePattern.ImprovedSoln;
class Email {
    private String sender;
    private String reciever;
    private String subject;
    private String body;
    public Email(String sender, String reciever, String subject, String body) {
        this.sender = sender;
        this.reciever = reciever;
        this.subject = subject;
        this.body = body;
    }
    public Email(Email email) {
        this.sender = email.sender;
        this.reciever = email.reciever;
        this.subject = email.subject;
        this.body = email.body;
    }
    public String getSender() {
        return sender;
    }
    public String getReciever() {
        return reciever;
    }
    public String getSubject() {
        return subject;
    }
    public String getBody() {
        return body;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public void setReciever(String reciever) {
        this.reciever = reciever;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setBody(String body) {
        this.body = body;
    }
}