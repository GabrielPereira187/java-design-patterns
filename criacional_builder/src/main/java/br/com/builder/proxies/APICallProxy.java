package br.com.builder.proxies;

import br.com.builder.entities.APICall;
import br.com.builder.interfaces.Call;

public class APICallProxy implements Call {
    private APICall apiCall;

    public APICallProxy(APICall apiCall) {
        this.apiCall = apiCall;
    }

    @Override
    public void call() {
        apiCall.call();
    }
}
