package br.com.abstract_factory.textbox;

public class DarkThemeTextBox implements TextBox {

    @Override
    public void click() {
        System.out.println("You clicked on dark theme textbox");
    }
}
