package br.com.decorator;

import br.com.decorator.decorators.Authenticator;
import br.com.decorator.decorators.BasicAuthDecorator;
import br.com.decorator.decorators.JWTAuthDecorator;
import br.com.decorator.interfaces.Authentication;

public class Main {
    public static void main(String[] args) {
        String username = "user01";
        String password = "pwd";

        Authentication authBasic = new BasicAuthDecorator(new Authenticator(username, password));
        authBasic.authenticateUser(username, password);

        System.out.println("\n\n");

        Authentication authBasicAndJwt = new BasicAuthDecorator(new JWTAuthDecorator(new Authenticator(username, password)));
        authBasicAndJwt.authenticateUser(username, password);
    }
}