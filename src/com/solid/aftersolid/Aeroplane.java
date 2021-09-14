package com.solid.aftersolid;

public class Aeroplane implements Plane, AeroplaneServices {
    public void bookTickets() {
        System.out.println("tickets booked in Aeroplane Class");
    }
    public void refillFuel() {
        System.out.println("Fuel refilled in Aeroplane Class");
    }

}
