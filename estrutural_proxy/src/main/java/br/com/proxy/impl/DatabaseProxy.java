package br.com.proxy.impl;

import br.com.proxy.interfaces.Database;

public class DatabaseProxy implements Database {

    private DatabaseImpl database;

    public DatabaseProxy(DatabaseImpl database) {
        this.database = database;
    }

    private boolean isSystemAdmin(int id) {
        return id % 2 == 0;
    }

    @Override
    public void alterar(int id) {
        if(isSystemAdmin(id)) {
            System.out.println("Permissão concedida: ALTERAR");
            database.alterar(id);
        } else {
            System.out.println("Permissão não concedida: ALTERAR(usuario nao é admin)");
        }
    }

    @Override
    public void consultar() {
        System.out.println("Permissão concedida: CONSULTAR");
        database.consultar();
    }
}
