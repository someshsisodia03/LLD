package LLD.FactoryPattern.Better;

public class CoffeeProcessor{
    Coffee getCoffee(String whichCoffee){
        Coffee coffee = new CoffeeFactory().prepare(whichCoffee);
        return coffee;
    }
}