package br.com.proxy;

import br.com.proxy.impl.DatabaseImpl;
import br.com.proxy.impl.DatabaseProxy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int id = random.nextInt(2) + 1;

        DatabaseProxy proxy = new DatabaseProxy(new DatabaseImpl());

        proxy.alterar(id);
        proxy.consultar();
    }
}