package observer_pattern;

public class MainScript {


    public static void main(String[] args) {
        System.out.println("Starting the execution");
        Observer obs1=new ConcreteObserver();
        Observer obs2=new ConcreteObserver();
        ConcreteSubject pub = new ConcreteSubject();
        pub.attach(obs1);
        pub.attach(obs2);

        pub.setApple_stock(100);
        pub.setApple_stock(200);

        pub.setGoogle_stock(300);
        pub.setGoogle_stock(400);

    }
}
