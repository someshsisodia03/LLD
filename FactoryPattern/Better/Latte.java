package LLD.FactoryPattern.Better;

public class Latte extends Coffee{
    public Latte(IngredientFactory icf){
        this.icf = icf;
    }
    @Override
    public void boil(){
        System.out.println(icf.getMilk().MilkName+" Latte is boiling");
    }
    @Override
    public void freeze(){
        System.out.println(icf.getSugar().SugarName+" Latte is freezing");
    }
    @Override
    public void brew(){
        System.out.println("Latte is brewing");
    }
}