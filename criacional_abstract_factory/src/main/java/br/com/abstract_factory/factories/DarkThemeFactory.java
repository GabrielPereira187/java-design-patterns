package br.com.abstract_factory.factories;

import br.com.abstract_factory.button.Button;
import br.com.abstract_factory.button.DarkThemeButton;
import br.com.abstract_factory.textbox.DarkThemeTextBox;
import br.com.abstract_factory.textbox.TextBox;

public class DarkThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }

    @Override
    public TextBox createTextBox() {
        return new DarkThemeTextBox();
    }
}
