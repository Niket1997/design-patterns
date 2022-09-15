package behavioral.observer.observers;

import behavioral.observer.interfaces.IObserver;
import behavioral.observer.observables.WeatherStation;

public class PhoneDisplay implements IObserver {
    private final WeatherStation station;

    public PhoneDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println("************ Phone Display ************");
        System.out.println("current temperature: " + station.getCurrentTemperature());
        System.out.println("************************");
        System.out.println();
    }
}
