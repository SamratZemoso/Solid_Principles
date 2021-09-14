package com.solid.aftersolid;

public class SolidPrinciples {

    public static void main(String[] args) {

        // Liskov Substitution
        Plane planeService = new JetPlane();
        planeService.refillFuel();

        JetPlaneServices jetService = new JetPlane();
        jetService.repairJet();

        Plane aero = new Aeroplane();
        aero.refillFuel();

        AeroplaneServices aeroService = new Aeroplane();
        aeroService.bookTickets();

        // Dependency Inversion
        BookTickets payViaCredit = new Payment(new CreditCard());
        payViaCredit.bookViaCredit();

        BookTickets payViaNet = new Payment(new NetBanking());
        payViaNet.bookViaNet();

    }
}
