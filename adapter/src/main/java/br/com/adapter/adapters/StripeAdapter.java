package br.com.adapter.adapters;

import br.com.adapter.api.StripeApi;
import br.com.adapter.service.PaymentService;

public class StripeAdapter implements PaymentService {
    private final StripeApi stripeApi;

    public StripeAdapter(StripeApi stripeApi) {
        this.stripeApi = stripeApi;
    }


    @Override
    public boolean processarPagamento(double amount) {
        return stripeApi.pay(amount);
    }

    @Override
    public boolean estornarPagamento(double amount) {
        return stripeApi.refund(amount);
    }
}
