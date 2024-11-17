package technology;

import java.time.Year;

public class Computer {
    private boolean hasScreen = true;
    private double screenSize;
    private int yearCreated;
    private boolean powerOn = false;


    public boolean getHasScreen() {
        return hasScreen;
    }

    public void setHasScreen(boolean hasScreen) {
        this.hasScreen = hasScreen;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }


    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public void powerButton() {
        if (powerOn) {
            powerOn = false;
        } else {
            powerOn = true;
        }
    }
    public int age() {
        int currentYear = Year.now().getValue();
        return (currentYear-yearCreated);
    }
}
