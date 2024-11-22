package br.com.builder.builders;

import br.com.builder.entities.APICall;

import java.util.Map;

public class APICallBuilder {
    private String baseUrl;
    private String key;
    private int timeout = 30;
    private int maxRetries = 5;
    private boolean ssl = false;
    private Map<String, String> headers = Map.of("Authorization", "Bearer Default");

    public APICallBuilder baseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    public APICallBuilder key(String key) {
        this.key = key;
        return this;
    }

    public APICallBuilder timeout(int timeout) {
        this.timeout = timeout > 0 ? timeout : this.timeout;
        return this;
    }

    public APICallBuilder numMaxRetries(int numMaxRetries) {
        this.maxRetries = numMaxRetries > 0 ? numMaxRetries : this.maxRetries;
        return this;
    }

    public APICallBuilder SSL(boolean sslEnabled) {
        this.ssl = sslEnabled;
        return this;
    }

    public APICallBuilder headers(Map<String, String> headers) {
        this.headers = headers != null ? headers : this.headers;
        return this;
    }

    public APICall build() {
        if(isNullOrEmpty(this.baseUrl) || isNullOrEmpty(this.key)) {
            throw new IllegalArgumentException("baseUrl/url must not be null or empty");
        }

        return new APICall(baseUrl, key, timeout, maxRetries, ssl, headers);
    }

    private boolean isNullOrEmpty(String info) {
        return info == null || info.equals("");
    }
}
