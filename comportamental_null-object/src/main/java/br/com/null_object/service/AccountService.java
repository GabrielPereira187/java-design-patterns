package br.com.null_object.service;

import br.com.null_object.db.AccountRepository;
import br.com.null_object.dto.AccountDTO;
import br.com.null_object.factory.AccountFactory;

public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountFactory accountFactory;

    public AccountService(AccountRepository accountRepository, AccountFactory accountFactory) {
        this.accountRepository = accountRepository;
        this.accountFactory = accountFactory;
    }

    public AccountDTO getAccountFromPersonId(Long id) {
        return accountFactory.createAccount(accountRepository.getAccountById(id));
    }
}
