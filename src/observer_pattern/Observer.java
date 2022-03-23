package observer_pattern;

public interface Observer {

    public void update(float apple_stock,float google_stock);

    float getObserverId();
}
