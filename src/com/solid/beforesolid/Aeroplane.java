package com.solid.beforesolid;

public class Aeroplane extends Service {
    @Override
    public void bookTickets() {
        System.out.println("Book Tickets in Aeroplane");
    }
    @Override
    public void refillFuel() {
        System.out.println("Fuel refill in Aeroplane");
    }
}
