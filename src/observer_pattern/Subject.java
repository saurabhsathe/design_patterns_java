package observer_pattern;

public interface Subject {

    public void attach(Observer observerID);
    public void detach(Observer observerID);
    public void notifyObservers();

}
