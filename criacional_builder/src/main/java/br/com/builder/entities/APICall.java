package br.com.builder.entities;

import br.com.builder.interfaces.Call;

import java.util.Map;

public class APICall implements Call {
    private String baseUrl;
    private String key;
    private int timeout;
    private int maxRetries;
    private boolean ssl;
    private Map<String, String> headers;


    @Override
    public void call() {
        System.out.println(this);
    }

    public APICall(String baseUrl, String key, int timeout, int maxRetries, boolean ssl, Map<String, String> headers) {
        this.baseUrl = baseUrl;
        this.key = key;
        this.timeout = timeout;
        this.maxRetries = maxRetries;
        this.ssl = ssl;
        this.headers = headers;
    }

    @Override
    public String toString() {
        return "APICall{" +
                "baseUrl='" + baseUrl + '\'' +
                ", key='" + key + '\'' +
                ", timeout=" + timeout +
                ", maxRetries=" + maxRetries +
                ", ssl=" + ssl +
                ", headers=" + headers +
                '}';
    }
}
