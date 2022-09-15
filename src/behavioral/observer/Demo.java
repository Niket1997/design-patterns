package behavioral.observer;

import behavioral.observer.interfaces.IObserver;
import behavioral.observer.observables.WeatherStation;
import behavioral.observer.observers.PhoneDisplay;
import behavioral.observer.observers.WindowDisplay;

public class Demo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation(30);
        IObserver phoneDisplay = new PhoneDisplay(station);
        IObserver windowDisplay = new WindowDisplay(station);

        station.addObserver(phoneDisplay);
        station.addObserver(windowDisplay);

        station.setCurrentTemperature(22);

        station.removeObserver(windowDisplay);

        station.setCurrentTemperature(18);
    }
}
