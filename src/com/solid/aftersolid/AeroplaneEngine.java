package com.solid.aftersolid;

public class AeroplaneEngine extends Engine {
    @Override
    public void start() {
        System.out.println("Aeroplane Engine Started");
    }
    @Override
    public void stop() {
        System.out.println("Aeroplane Engine Stopped");
    }
}
