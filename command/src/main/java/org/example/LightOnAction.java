package org.example;

public class LightOnAction implements Action {
    private Light light;

    public LightOnAction(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}
