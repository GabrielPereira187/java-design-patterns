package br.com.adapter.api;

public class PaypalApi implements ApiService {

    public boolean pay(double amount) {
        System.out.println("Processando pagamento via paypal de: " + amount);
        return true;
    }

    public boolean refund(double amount) {
        System.out.println("Reembolsando pagamento via paypal de: " + amount);
        return true;
    }
}
