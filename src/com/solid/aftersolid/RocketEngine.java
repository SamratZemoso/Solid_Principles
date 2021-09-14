package com.solid.aftersolid;

public class RocketEngine extends Engine {
    @Override
    public void start() {
        System.out.println("Rocket Engine Started");
    }
    @Override
    public void stop() {
        System.out.println("Rocket Engine Stopped");
    }
}
