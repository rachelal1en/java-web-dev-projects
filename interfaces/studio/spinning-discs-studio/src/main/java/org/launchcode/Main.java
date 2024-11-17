package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD shainaTwain = new CD(16.1f, 12, "200 - 500");
        DVD downWithLove = new DVD(24.3f, 14, "570 - 1600");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        shainaTwain.spinDisk();
        downWithLove.spinDisk();
    }
}