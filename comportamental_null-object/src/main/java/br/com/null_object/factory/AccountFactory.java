package br.com.null_object.factory;

import br.com.null_object.dto.AccountDTO;
import br.com.null_object.dto.NullAccountDTO;
import br.com.null_object.entity.Account;

import java.math.BigDecimal;

public class AccountFactory {

    public AccountDTO createAccount(Account account) {
        return account == null ? new NullAccountDTO()
                : new AccountDTO(account.getName(), account.getAmount());
    }

}
