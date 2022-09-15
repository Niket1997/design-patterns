package behavioral.observer.observables;

import behavioral.observer.interfaces.IObservable;
import behavioral.observer.interfaces.IObserver;

import java.util.HashSet;

public class WeatherStation implements IObservable {
    private final HashSet<IObserver> observers;
    private int currentTemperature;

    public WeatherStation(int currentTemperature) {
        observers = new HashSet<>();
        this.currentTemperature = currentTemperature;
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
        notifyObservers();
    }
}
