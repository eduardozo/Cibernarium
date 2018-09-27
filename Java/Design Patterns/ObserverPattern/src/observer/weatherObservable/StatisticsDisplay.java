package observer.weatherObservable;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public StatisticsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            float temp = weatherData.getTemperature();
            tempSum += temp;
            numReadings++;
            if (temp > maxTemp) {
                maxTemp = temp;
            }
            if (temp < minTemp) {
                minTemp = temp;
            }
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("\n[---- Statistics ----]");
        System.out.println("Avg: " + (tempSum / numReadings) + "\n"
                        + "Max: " + maxTemp + "\n"
                        + "Min: " + minTemp + "\n"
        );
    }
}
