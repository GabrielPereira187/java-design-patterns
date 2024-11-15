package br.com.null_object.db;

import br.com.null_object.entity.Account;

import java.math.BigDecimal;

public class AccountRepository {
    public Account getAccountById(Long id) {
        return id % 2 == 0 ? new Account(id, "John Doe", BigDecimal.TEN) : null;
    }
}
