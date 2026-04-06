package LLD.FactoryPattern.Better;

public class CoffeeFactory{
    Coffee coffee;
    IngredientFactory icf;

    Coffee prepare(String whichCoffee,Milk whichMilk,Sugar whichSugar){

        if(whichCoffee.equals("Latte")){
            icf = new LatteIngredient(whichMilk,whichSugar);
            coffee=new Latte(icf);
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