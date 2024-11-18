package br.com.null_object;

import br.com.null_object.db.AccountRepository;
import br.com.null_object.dto.AccountDTO;
import br.com.null_object.factory.AccountFactory;
import br.com.null_object.service.AccountService;

public class Main {
    public static void main(String[] args) {
        AccountService service = new AccountService(new AccountRepository(), new AccountFactory());

        AccountDTO accountDTO_1 = service.getAccountFromPersonId(2L);

        System.out.println(accountDTO_1);

        AccountDTO accountDTO_2 = service.getAccountFromPersonId(5L);

        //null object
        System.out.println(accountDTO_2);
    }
}