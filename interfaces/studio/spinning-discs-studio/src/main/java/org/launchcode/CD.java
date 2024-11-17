package org.launchcode;

public class CD extends BaseDisc{
    // TODO: Implement your custom interface.

    public CD(float storageCapactiy, int numberOfTracks, String rpm) {
        super(storageCapactiy, numberOfTracks, rpm);
    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

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
