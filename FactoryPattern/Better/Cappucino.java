package LLD.FactoryPattern.Better;

public class Cappucino extends Coffee{
    @Override
    public void boil(){
        System.out.println("Cappucino is boiling");
    }
    @Override
    public void freeze(){
        System.out.println("Cappucino is freezing");
    }
    @Override
    public void brew(){
        System.out.println("Cappucino is brewing");
    }
}