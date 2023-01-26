package observer.observators;

import observer.Observer;
import observer.WeatherForecast;

public class TvNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast forecast) {
        System.out.println("TvNews: today weather: " + forecast.getTemperature() + " * C and " + forecast.getPleasure() + " hPa");
    }
}
