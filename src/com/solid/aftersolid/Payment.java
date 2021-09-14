package com.solid.aftersolid;

public class Payment implements BookTickets {
    public PaymentStatus anyType;
    boolean status;
    public Payment(PaymentStatus anyType) {
        this.anyType = anyType;
        this.status = false;
    }
    public void bookViaCredit() {
        boolean checkStatus = this.status;
        if(checkStatus) {
            anyType.paymentSuccess();
            this.status = false;
        } else {
            anyType.paymentFailure();
            this.status = true;
        }
    }
    public void bookViaNet() {
        boolean checkStatus = !this.status;
        if(checkStatus) {
            anyType.paymentSuccess();
            this.status = false;
        } else {
            anyType.paymentFailure();
            this.status = true;
        }
    }
}
