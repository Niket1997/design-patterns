package behavioral.observer.observers;

import behavioral.observer.interfaces.IObserver;
import behavioral.observer.observables.WeatherStation;

public class WindowDisplay implements IObserver {
    private final WeatherStation station;

    public WindowDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println("************ Window Display ************");
        System.out.println("current temperature: " + station.getCurrentTemperature());
        System.out.println("************************");
        System.out.println();
    }
}
