package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean sensorOn;

    public TemperatureSensor() {
        this.sensorOn = false;
    }

    @Override
    public boolean isOn() {
        return this.sensorOn;
    }

    @Override
    public void setOn() {
        this.sensorOn = true;
    }

    @Override
    public void setOff() {
        this.sensorOn = false;

    }

    @Override
    public int read() {
        Random random = new Random();
        int randomNumber = (random.nextInt(61) - 30);
        if (isOn()) {
            return randomNumber;
        } else {
            throw new IllegalStateException();
        }

    }

}
