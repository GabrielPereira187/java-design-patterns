package br.com.decorator.decorators;

import br.com.decorator.interfaces.Authentication;

public class BasicAuthDecorator extends BaseAuthDecorator{

    public BasicAuthDecorator(Authentication wrapper) {
        super(wrapper);
    }

    public void authenticateUser(String username, String password) {
        super.authenticateUser(username, password);
        String dbPassword = database.getPasswordByUsername(username);
        if(dbPassword.equals(password)) {
            System.out.println("User authenticated");
        } else {
            System.out.println("Auth Failed");
        }
    }
}
