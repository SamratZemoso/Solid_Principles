package com.solid.aftersolid;

public class NetBanking implements PaymentStatus {
    public void paymentFailure() {
        System.out.println("Payment Failed in Net Banking");
    }
    public void paymentSuccess() {
        System.out.println("Payment Success in Net banking");
    }
}
