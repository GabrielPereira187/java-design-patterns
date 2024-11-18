package br.com.abstract_factory.button;

public class LightThemeButton implements Button{
    @Override
    public void click() {
        System.out.println("You clicked on a light theme button");
    }
}
