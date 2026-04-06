package LLD.FactoryPattern.Naive;

public class CoffeeProcessor{
    Coffee getCoffee(String whichCoffee){
        Coffee coffee = new CoffeeFactory().prepare(whichCoffee);
        return coffee;
    }
}