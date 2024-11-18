package br.com.adapter.api;

public class StripeApi implements ApiService {

    public boolean pay(double amount) {
        System.out.println("Processando pagamento via stripe de: " + amount);
        return true;
    }

    public boolean refund(double amount) {
        System.out.println("Reembolsando pagamento via stripe de: " + amount);
        return true;
    }
}
