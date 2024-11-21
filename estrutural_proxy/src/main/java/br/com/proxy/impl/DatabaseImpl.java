package br.com.proxy.impl;

import br.com.proxy.interfaces.Database;

public class DatabaseImpl implements Database {

    @Override
    public void alterar(int id) {
        System.out.println("alterado");

    }

    @Override
    public void consultar() {
        System.out.println("consultado");
    }
}
