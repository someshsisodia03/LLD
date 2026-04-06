package LLD.FactoryPattern.Naive;
public class Main{
    public static void main(String[] args) {
        CoffeeProcessor cpr = new CoffeeProcessor();
        Coffee coffee = cpr.getCoffee("Latte");
        coffee.boil();
        coffee.freeze();
        coffee.brew();
    }
}