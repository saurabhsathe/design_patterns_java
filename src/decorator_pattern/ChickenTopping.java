package decorator_pattern;

public class ChickenTopping extends ToppingDecorator{
    public ChickenTopping(Pizza p) {
        super(p);
    }
    @Override
    public String description() {
        return tempPizza.description()+", Chicken";
    }

    @Override
    public float cost() {
        return (tempPizza.cost()+3);
    }
}
