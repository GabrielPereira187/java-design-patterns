package br.com.decorator.decorators;

import br.com.decorator.interfaces.Authentication;

public class JWTAuthDecorator extends BaseAuthDecorator{
    public JWTAuthDecorator(Authentication wrapper) {
        super(wrapper);
    }

    public void authenticateUser(String username, String password) {
        super.authenticateUser(username, password);
        String jwt = jwtService.getJwt(username, password);
        if(jwtService.jwtIsValid(jwt)) {
            System.out.println("JWT authenticated successfully");
        } else {
            System.out.println("JWT authentication failed");
        }
    }

}
