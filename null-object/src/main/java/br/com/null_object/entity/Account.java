package br.com.null_object.entity;

import java.math.BigDecimal;

public class Account {

    private Long id;
    private String name;
    private BigDecimal amount;

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Account(Long id, String name, BigDecimal amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
}
