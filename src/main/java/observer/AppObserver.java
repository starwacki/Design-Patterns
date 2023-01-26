package observer;

import observer.observators.InternetNews;
import observer.observators.RadioNews;
import observer.observators.TvNews;

public class AppObserver {
    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(29,1020);

        //Register observers
        weatherForecast.registerObserver(new InternetNews());
        weatherForecast.registerObserver(new RadioNews());
        weatherForecast.registerObserver(new TvNews());

        //notify observers
        weatherForecast.notifyObservers();

        //Notify observers after change object
        System.out.println("------------------------");
        weatherForecast.setTemperature(15);
        weatherForecast.notifyObservers();

    }
}
