package br.com.criacional_singleton;

import br.com.criacional_singleton.singleton.DatabaseConfiguration;

public class Main {
    public static void main(String[] args) {
        DatabaseConfiguration databaseConfiguration = DatabaseConfiguration.getInstance();

        DatabaseConfiguration databaseConfiguration2 = DatabaseConfiguration.getInstance();

        System.out.println(databaseConfiguration == databaseConfiguration2); // only created one instance of configuration
    }
}