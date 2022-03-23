package decorator_pattern;

public class PlainPizza implements Pizza {

    @Override
    public String description() {
            return("pizza dough");
    }

    @Override
    public float cost() {
        return 4;
    }
}
