package observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {

    private int temperature;

    private int pleasure;

    private Set<Observer> observers = new HashSet<>();

    public WeatherForecast(int temperature, int pleasure) {
        this.temperature = temperature;
        this.pleasure = pleasure;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPleasure() {
        return pleasure;
    }

    public void setPleasure(int pleasure) {
        this.pleasure = pleasure;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.updateForecast(this);
        }
    }
}
