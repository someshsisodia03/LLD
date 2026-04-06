package LLD.FactoryPattern.Naive;

public class CoffeeFactory{
    Coffee prepare(String whichCoffee){
        Coffee coffee;
        if(whichCoffee.equals("Latte")){
            coffee=new Latte();
        }
        else if(whichCoffee.equals("Espresso")){
            coffee=new Espresso();
        }
        else{
            coffee=new Cappucino();
        }
        return coffee;
    }
}