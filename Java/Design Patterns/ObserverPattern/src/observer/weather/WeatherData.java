package observer.weather;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float tempeture;
    private float humedity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(0);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i); //todo casting
            observer.update(tempeture, humedity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float tempeture, float humedity, float pressure) {
        this.tempeture = tempeture;
        this.humedity = humedity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTempeture() {
        return tempeture;
    }

    public float getHumedity() {
        return humedity;
    }

    public float getPressure() {
        return pressure;
    }
}
