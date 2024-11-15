package br.com.null_object.dto;

import java.math.BigDecimal;

public class AccountDTO {
    private String name;
    private BigDecimal amount;

    public AccountDTO(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
