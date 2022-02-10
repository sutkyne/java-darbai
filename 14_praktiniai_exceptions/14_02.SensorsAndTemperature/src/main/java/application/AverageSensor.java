package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> listSensor;
    private List<Integer> avgReadings;
    private boolean avgSensor;

    public AverageSensor() {
        listSensor = new ArrayList<>();
        avgReadings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {

        listSensor.forEach(s -> avgSensor = s.isOn());
        return avgSensor;
    }

    @Override
    public void setOn() {
        listSensor.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        listSensor.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        if (avgSensor == false || listSensor.isEmpty()) throw new IllegalStateException();
        double sensorsAvg = listSensor.stream().mapToDouble(Sensor::read).average().orElse(Double.NaN);
        avgReadings.add((int) sensorsAvg);
        return (int) sensorsAvg;


    }

    public void addSensor(Sensor toAdd) {
        listSensor.add(toAdd);
    }

    public List<Integer> readings() {
        return avgReadings;
    }
}
