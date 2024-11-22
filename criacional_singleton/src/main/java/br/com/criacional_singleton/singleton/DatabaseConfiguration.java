package br.com.criacional_singleton.singleton;

public class DatabaseConfiguration {
    private String url;
    private String user;
    private String password;

    private static DatabaseConfiguration databaseConfiguration;

    private DatabaseConfiguration() {
        this.url = "jdbc:postgresql://localhost:5432/meu_banco";
        this.user = "user";
        this.password = "password1234";
    }

    public static DatabaseConfiguration getInstance() {
        if(databaseConfiguration == null) {
            databaseConfiguration = new DatabaseConfiguration();
        }
        return databaseConfiguration;
    }

    @Override
    public String toString() {
        return "DatabaseConfiguration{" +
                "url='" + url + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
