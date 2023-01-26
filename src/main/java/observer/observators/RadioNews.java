package observer.observators;

import observer.Observer;
import observer.WeatherForecast;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast forecast) {
        System.out.println("RadioNews: today weather: " + forecast.getTemperature() + " * C and " + forecast.getPleasure() + " hPa");
    }
}
