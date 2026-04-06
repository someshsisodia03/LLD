package LLD.FactoryPattern.Better;

public class Latte implements Coffee{
    @Override
    public void boil(){
        System.out.println("Latte is boiling");
    }
    @Override
    public void freeze(){
        System.out.println("Latte is freezing");
    }
    @Override
    public void brew(){
        System.out.println("Latte is brewing");
    }
}