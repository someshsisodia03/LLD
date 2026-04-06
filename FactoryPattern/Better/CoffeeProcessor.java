package LLD.FactoryPattern.Better;

public class CoffeeProcessor{
    Coffee getCoffee(String whichCoffee,Milk milk,Sugar sugar){
        Coffee coffee = new CoffeeFactory().prepare(whichCoffee,milk,sugar);
        return coffee;
    }
}