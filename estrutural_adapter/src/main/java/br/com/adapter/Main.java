package br.com.adapter;

import br.com.adapter.adapters.PaypalAdapter;
import br.com.adapter.adapters.StripeAdapter;
import br.com.adapter.api.PaypalApi;
import br.com.adapter.api.StripeApi;
import br.com.adapter.processor.OrderProcessor;
import br.com.adapter.service.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentService paypalAdapter = new PaypalAdapter(new PaypalApi());
        OrderProcessor paypalProcessor = new OrderProcessor(paypalAdapter);

        PaymentService stripeAdapter = new StripeAdapter(new StripeApi());
        OrderProcessor stripeProcessor = new OrderProcessor(stripeAdapter);

        paypalProcessor.order(500);
        paypalProcessor.refundPayment(500);

        stripeProcessor.order(300);
        stripeProcessor.refundPayment(200);

    }
}