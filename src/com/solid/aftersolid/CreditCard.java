package com.solid.aftersolid;

public class CreditCard implements PaymentStatus {
    public void paymentFailure() {
        System.out.println("Payment Failed in Credit Card");
    }
    public void paymentSuccess() {
        System.out.println("Payment Success in Credit Card");
    }
}
