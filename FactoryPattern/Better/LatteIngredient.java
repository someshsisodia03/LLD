package LLD.FactoryPattern.Better;

public class LatteIngredient implements IngredientFactory{
    Milk milk;
    Sugar sugar;

    public LatteIngredient(Milk milk,Sugar sugar) {
        this.milk=milk;
        this.sugar=sugar;
    }
    @Override
    public Milk getMilk(){
        return this.milk;
    }
    @Override
    public Sugar getSugar(){
        return this.sugar;
    }
    
}