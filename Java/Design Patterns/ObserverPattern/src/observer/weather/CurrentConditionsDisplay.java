package observer.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humedity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humedity, float pressure) {
        this.temperature = temp;
        this.humedity = humedity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "Fº and " + humedity + "% humidity");
    }
}
