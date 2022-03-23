package decorator_pattern;

abstract public class ToppingDecorator implements Pizza{

    protected Pizza tempPizza;

    public  ToppingDecorator(Pizza p){
        tempPizza=p;
    }

    @Override
    public String description() {
        return tempPizza.description();
    }

    @Override
    public float cost() {
        return tempPizza.cost();
    }
}
