package LLD.FactoryPattern.Better;

public class OatMilk extends Milk{
    public OatMilk(){
        this.MilkName="Oat";        
    }
    @Override
    public Milk getMilk(){
        return new OatMilk();
    }
}