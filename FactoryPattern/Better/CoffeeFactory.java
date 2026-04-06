package LLD.FactoryPattern.Better;

public class CoffeeFactory{
    Coffee prepare(String whichCoffee){
        Coffee coffee;
        if(whichCoffee.equals("Latte")){
            coffee=new Latte();
        }
        if(whichCoffee.equals("Espresso")){
            coffee=new Espresso();
        }
        else{
            coffee=new Cappucino();
        }
        return coffee;
    }
}