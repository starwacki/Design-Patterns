package observer.observators;

import observer.Observer;
import observer.WeatherForecast;

public class InternetNews  implements Observer {
    @Override
    public void updateForecast(WeatherForecast forecast) {
        System.out.println("InternetNews: today weather: " + forecast.getTemperature() + " * C and " + forecast.getPleasure() + " hPa");
    }
}
