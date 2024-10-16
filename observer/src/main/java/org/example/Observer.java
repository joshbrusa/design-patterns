package org.example;

public class Observer {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Display phoneDisplay = new Display("Phone");
        Display windowDisplay = new Display("Window");

        station.registerListener(phoneDisplay);
        station.registerListener(windowDisplay);

        station.setTemperature(25.3f);
        station.setTemperature(26.7f);
    }
}