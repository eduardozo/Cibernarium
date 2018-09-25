package observer.weather;

public interface Observer {
    public void update(float temp, float humedity, float pressure);
}
