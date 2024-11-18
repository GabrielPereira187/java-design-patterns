package br.com.decorator.jwt;

public class JWTService {

    public boolean jwtIsValid(String jwt) {
        return true;
    }

    public String getJwt(String username, String password) {
        return "example-of-jwt";
    }

}
