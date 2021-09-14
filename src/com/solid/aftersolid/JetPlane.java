package com.solid.aftersolid;

public class JetPlane implements Plane, JetPlaneServices {
    public void refillFuel() {
        System.out.println("Refill Fuel in Jet Plane");
    }
    public void repairJet() {
        System.out.println("Repair Jet Plane");
    }

}
