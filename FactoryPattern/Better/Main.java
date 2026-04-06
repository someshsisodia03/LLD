package LLD.FactoryPattern.Better;
public class Main{
    public static void main(String[] args) {
        CoffeeProcessor cpr = new CoffeeProcessor();
        Coffee coffee = cpr.getCoffee("Latte",new OatMilk(),new BrownSugar());
        coffee.boil();
        coffee.freeze();
        coffee.brew();
    }
}