package br.com.adapter.service;

public interface PaymentService {
    boolean proccessPayment(double amount);
    boolean refundPayment(double amount);
}
