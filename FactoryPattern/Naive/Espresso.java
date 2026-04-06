package LLD.FactoryPattern.Naive;

public class Espresso implements Coffee{
    @Override
    public void boil(){
        System.out.println("Espresso is boiling");
    }
    @Override
    public void freeze(){
        System.out.println("Espresso is freezing");
    }
    @Override
    public void brew(){
        System.out.println("Espresso is brewing");
    }
}