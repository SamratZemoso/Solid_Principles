package com.solid.beforesolid;

public class Payment {
    CreditCard payCC;
    Netbanking payNB;
    public boolean status;
    public Payment(CreditCard pay) {
        this.payCC = pay;
        this.status = false;
    }
    public Payment(Netbanking pay) {
        this.payNB = pay;
        this.status = false;
    }
    public void bookViaCredit() {
        boolean checkStatus = this.status;
        if(checkStatus) {
            payCC.paymentSuccess();
            this.status = false;
        } else {
            payCC.paymentFailure();
            this.status = true;
        }
    }
    public void bookViaNet() {
        boolean checkStatus = !this.status;
        if(checkStatus) {
            payNB.paymentSuccess();
            this.status = false;
        } else {
            payNB.paymentFailure();
            this.status = true;
        }
    }
}
