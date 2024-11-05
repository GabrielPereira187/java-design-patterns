package br.com.abstract_factory.app;

import br.com.abstract_factory.button.Button;
import br.com.abstract_factory.factories.ThemeFactory;
import br.com.abstract_factory.textbox.TextBox;

public class Application {
    private Button button;
    private TextBox textBox;

    public Application(ThemeFactory factory) {
        this.button = factory.createButton();
        this.textBox = factory.createTextBox();
    }

    public void click() {
        button.click();
        textBox.click();
    }
}
