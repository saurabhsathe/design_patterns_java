package decorator_pattern;

public class BellPepperTopping extends ToppingDecorator{

    public BellPepperTopping(Pizza p) {
        super(p);
    }
    @Override
    public String description() {
        return tempPizza.description()+", Bell Peppers";
    }

    @Override
    public float cost() {
        return (tempPizza.cost()+1);
    }
}
