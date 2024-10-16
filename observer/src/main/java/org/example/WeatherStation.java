package org.example;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private final List<Listener> listeners =  new ArrayList<>();
    private float temperature;

    @Override
    public void registerListener(Listener l) {
        listeners.add(l);
    }

    @Override
    public void removeListener(Listener l) {
        listeners.remove(l);
    }

    @Override
    public void notifyListeners() {
        for (Listener l : listeners) {
            l.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyListeners();
    }
}
