package br.com.decorator.decorators;

import br.com.decorator.db.Database;
import br.com.decorator.interfaces.Authentication;

public class Authenticator implements Authentication {

    private final String username;
    private final String password;

    public Authenticator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void authenticateUser(String name, String password) {
        System.out.println("Authenticating user: " + name);
    }
}
