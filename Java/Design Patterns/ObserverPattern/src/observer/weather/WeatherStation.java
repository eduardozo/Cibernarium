package observer.weather;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentCondition = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecast = new ForecastDisplay(weatherData);
        StatisticsDisplay statistics = new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatIndex = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
