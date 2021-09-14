package com.solid.beforesolid;

public class SolidPrinciples {

    public static void main(String[] args) {

        // Liskov Principle
        JetPlane jet = new JetPlane();
        jet.refillFuel();
        jet.bookTickets();

        Aeroplane aero = new Aeroplane();
        aero.bookTickets();
        aero.refillFuel();

        // Dependency Inversion
        Payment payViaCard = new Payment(new CreditCard());
        payViaCard.bookViaCredit();

        Payment payViaNet = new Payment(new Netbanking());
        payViaNet.bookViaNet();

    }

}
