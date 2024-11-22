package br.com.builder;

import br.com.builder.builders.APICallBuilder;
import br.com.builder.entities.APICall;
import br.com.builder.interfaces.Call;
import br.com.builder.proxies.APICallProxy;

public class Main {
    public static void main(String[] args) {
        APICall correctApiCall = new APICallBuilder()
                .baseUrl("http://localhost:8080")
                .key("api-key")
                .SSL(false)
                .timeout(10)
                .build();

        Call call = new APICallProxy(correctApiCall);
        call.call();

        //exception will be thrown because url is null
        try {
            APICall incorrectApiCall = new APICallBuilder()
                    .key("api-key")
                    .SSL(false)
                    .timeout(10)
                    .build();

            Call incorrectCall = new APICallProxy(incorrectApiCall);
            incorrectCall.call();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}