package com.app;

public class Main {

    public static void main(String[] args) {
        Drone drone = new Drone("Sony", 100, 500, "400w");

        drone.takeOff();
    }
}
// Airplane inherits from Aircraft