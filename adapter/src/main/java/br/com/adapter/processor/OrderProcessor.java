package br.com.adapter.processor;

import br.com.adapter.service.PaymentService;

public class OrderProcessor {
    private PaymentService paymentService;

    public OrderProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void order(double amount) {
        if(paymentService.proccessPayment(amount)) {
            System.out.println("Success to process payment");
        } else {
            System.out.println("Failed to complete order");
        }
    }

    public void refundPayment(double amount) {
        if(paymentService.refundPayment(amount)) {
            System.out.println("Success to refund payment");
        } else {
            System.out.println("Failed to complete refund");
        }
    }
}
