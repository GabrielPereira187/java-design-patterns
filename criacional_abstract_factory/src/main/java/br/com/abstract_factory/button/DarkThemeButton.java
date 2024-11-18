package br.com.abstract_factory.button;

public class DarkThemeButton implements Button{
    @Override
    public void click() {
        System.out.println("You clicked on a dark theme button");
    }
}
