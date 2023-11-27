package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{

    private boolean isOn = false;
    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        isOn = true;
    }

    @Override
    public void setOff() {
        isOn = false;
    }

    @Override
    public int read() {
        if (isOn()){
            return 30 - new Random().nextInt(61);
        }
        throw new IllegalArgumentException();
    }
}
