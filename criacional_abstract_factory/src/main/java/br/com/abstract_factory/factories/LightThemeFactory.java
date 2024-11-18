package br.com.abstract_factory.factories;

import br.com.abstract_factory.button.Button;
import br.com.abstract_factory.button.LightThemeButton;
import br.com.abstract_factory.textbox.LightThemeTextBox;
import br.com.abstract_factory.textbox.TextBox;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new LightThemeButton();
    }

    @Override
    public TextBox createTextBox() {
        return new LightThemeTextBox();
    }
}
