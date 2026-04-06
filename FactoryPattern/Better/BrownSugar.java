package LLD.FactoryPattern.Better;

public class BrownSugar extends  Sugar{
    public BrownSugar(){
        this.SugarName = "Brown Sugar";
    }
    @Override
    public Sugar getSugar(){
        return new BrownSugar();
    }
}