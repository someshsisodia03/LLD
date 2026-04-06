package LLD.FactoryPattern.Better;

public abstract class Coffee {
    Milk milk;
    Sugar sugar;
    IngredientFactory icf;
    abstract void boil();
    abstract void freeze();
    abstract void brew();
}