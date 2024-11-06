package br.com.adapter.api;

public interface ApiService {

    boolean pay(double amount);
    boolean refund(double amount);
}
