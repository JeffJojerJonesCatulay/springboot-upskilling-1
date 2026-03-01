package com.jecatulay.springboot_upskilling_1;

public class MayaPaymentService implements PaymentService{
    @Override
    public void makePayment(double amount){
        System.out.println("Making payment of " + amount + " using Maya");
    }
}
