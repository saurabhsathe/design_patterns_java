package observer_pattern;

public class ConcreteObserver implements Observer{

    float apple_stock;
    float google_stock;
    static float observer_id;
    float id;
    public ConcreteObserver(){
        this.id=++ConcreteObserver.observer_id;
    }

    public float getObserverId(){
        return this.id;
    }

    @Override
    public void update(float apple_stock, float google_stock) {
        this.apple_stock=apple_stock;
        this.google_stock=google_stock;
        System.out.println("Updated the stock prices for "+this.id+" : "+this.apple_stock+" , "+this.google_stock);
    }
}
