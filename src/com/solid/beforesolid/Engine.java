package com.solid.beforesolid;

public class Engine {
    public void start(String name) {
        if(name == "RocketEngine") {
            System.out.println("Engine Started for Rocket");
        } else if(name == "AeroplaneEngine") {
            System.out.println("Engine Started for Aeroplane");
        }
    }
    public void stop(String name) {
        if(name == "RocketEngine") {
            System.out.println("Engine Stopped for Rocket");
        } else if(name == "AeroplaneEngine") {
            System.out.println("Engine Stopped for Aeroplane");
        }
    }
    public void getEngineNumber() {
        System.out.println("Engine Number in Engine class");
    }
}
