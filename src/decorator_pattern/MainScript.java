package decorator_pattern;

public class MainScript {
    public static void main(String[] args) {
        Pizza p = new ChickenTopping(new BellPepperTopping(new PlainPizza()));
        System.out.println("This is your final pizza"+p.description());
        System.out.println("This is your final pizza cost"+p.cost());
    }
}
