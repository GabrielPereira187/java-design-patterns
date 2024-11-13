package br.com.decorator.decorators;

import br.com.decorator.db.Database;
import br.com.decorator.interfaces.Authentication;
import br.com.decorator.jwt.JWTService;

public class BaseAuthDecorator implements Authentication {
    private final Authentication wrapper;
    protected final Database database;
    protected final JWTService jwtService;

    public BaseAuthDecorator(Authentication wrapper) {
        this.wrapper = wrapper;
        database = new Database();
        jwtService = new JWTService();
    }

    @Override
    public void authenticateUser(String name, String password) {
        wrapper.authenticateUser(name, password);
    }
}
