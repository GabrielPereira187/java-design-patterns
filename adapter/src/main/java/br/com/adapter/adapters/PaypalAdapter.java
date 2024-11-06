package br.com.adapter.adapters;

import br.com.adapter.api.PaypalApi;
import br.com.adapter.service.PaymentService;

public class PaypalAdapter implements PaymentService {
    private final PaypalApi paypalApi;

    public PaypalAdapter(PaypalApi paypalApi) {
        this.paypalApi = paypalApi;
    }

    @Override
    public boolean processarPagamento(double amount) {
        return paypalApi.pay(amount);
    }

    @Override
    public boolean estornarPagamento(double amount) {
        return paypalApi.refund(amount);
    }
}
