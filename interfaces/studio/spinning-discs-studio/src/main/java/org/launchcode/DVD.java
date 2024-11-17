package org.launchcode;

public class DVD extends BaseDisc {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public DVD(float storageCapactiy, int numberOfTracks, String rpm) {
        super(storageCapactiy, numberOfTracks, rpm);
    }

    @Override
    public void readDisc() {

    }

    @Override
    public void writeDisc() {

    }

    @Override
    public void playTrack() {

    }

    @Override
    public void spinDisk() {
        System.out.println("DVD spins at " + this.getRpm() + " rpm.");

    }
}
