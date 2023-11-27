package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AverageSensor implements Sensor{

    private ArrayList<Sensor> sensors = new ArrayList<>();
    private ArrayList<Integer> sensorReadings = new ArrayList<>();

    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        if (sensors.stream().filter(Sensor::isOn).count() == sensors.size()){
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        for (Sensor obj : sensors) {
            obj.setOn();  // Call the method on each object
        }
    }

    @Override
    public void setOff() {
        sensors.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        if (!this.isOn() || sensors.isEmpty()) {
            throw new IllegalStateException();
        }

        int averageReading = (int) sensors.stream()
                .mapToInt(Sensor::read)
                .average()
                .orElseThrow(IllegalStateException::new); // Handle the case where average is not present

        sensorReadings.add(averageReading);
        return averageReading;
    }


    public List<Integer> readings(){
        return sensorReadings;
    }
}
