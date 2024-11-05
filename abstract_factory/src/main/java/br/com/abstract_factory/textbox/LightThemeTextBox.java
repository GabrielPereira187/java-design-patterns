package br.com.abstract_factory.textbox;

public class LightThemeTextBox implements TextBox{
    @Override
    public void click() {
        System.out.println("You clicked on light theme textbox");
    }
}
