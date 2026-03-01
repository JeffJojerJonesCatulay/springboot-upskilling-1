package com.jecatulay.springboot_upskilling_1;

public class OrderService {

    private PaymentService paymentService;
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeorder(double amount){
        paymentService.makePayment(amount);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
