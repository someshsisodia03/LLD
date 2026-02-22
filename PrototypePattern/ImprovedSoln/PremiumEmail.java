package LLD.PrototypePattern.ImprovedSoln;
class PremiumEmail extends Email {
    private String cc;
    private String bcc;
    public PremiumEmail(String sender, String reciever, String subject, String body,String cc,String bcc) {
        super(sender, reciever, subject, body);
        this.cc = cc;
        this.bcc = bcc;
    }
    public PremiumEmail(PremiumEmail email) {
        super(email);
        this.cc = email.cc;
        this.bcc = email.bcc;
    }
    @Override
    public PremiumEmail copy() {
        return new PremiumEmail(this);
    }
    public String getcc() {
        return cc;
    }
    public String getbcc() {
        return bcc;
    }
    public void setcc(String cc) {
        this.cc = cc;
    }
    public void setbcc(String bcc) {
        this.bcc = bcc;
    }
}