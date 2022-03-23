package observer_pattern;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{

    ArrayList<Observer> observers= new ArrayList<>();
    float apple_stock=0;
    float google_stock=0;
    @Override
    public void attach(Observer observerID) {
        this.observers.add(observerID);
    }

    @Override
    public void detach(Observer observerID) {
        this.observers.remove(observerID.getObserverId()-1);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs:this.observers){
            obs.update(this.apple_stock,this.google_stock);
        }
    }

    public void setApple_stock(float apple_stock) {
        this.apple_stock = apple_stock;
        notifyObservers();
    }

    public void setGoogle_stock(float google_stock) {
        this.google_stock = google_stock;
        notifyObservers();
    }
}
