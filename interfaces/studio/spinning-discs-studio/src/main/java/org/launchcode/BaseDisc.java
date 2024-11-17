package org.launchcode;

public abstract class BaseDisc implements OpticalReadable {
    private float storageCapactiy;
    private int numberOfTracks;
    private String rpm;

    public BaseDisc(float storageCapactiy, int numberOfTracks, String rpm) {
        this.storageCapactiy = storageCapactiy;
        this.numberOfTracks = numberOfTracks;
        this.rpm = rpm;
    }

    public float getStorageCapactiy() {
        return storageCapactiy;
    }

    public void setStorageCapactiy(float storageCapactiy) {
        this.storageCapactiy = storageCapactiy;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }
}
