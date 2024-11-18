package br.com.abstract_factory;

import br.com.abstract_factory.app.Application;
import br.com.abstract_factory.factories.DarkThemeFactory;
import br.com.abstract_factory.factories.LightThemeFactory;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Application app = configureApp();
        app.click();
    }

    private static Application configureApp() {
        Random random = new Random();
        int theme = random.nextInt(1, 7);
        return theme % 2 == 0 ?
                new Application(new LightThemeFactory())
                : new Application(new DarkThemeFactory());
    }
}