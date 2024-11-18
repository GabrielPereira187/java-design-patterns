package br.com.abstract_factory.factories;

import br.com.abstract_factory.button.Button;
import br.com.abstract_factory.textbox.TextBox;

public interface ThemeFactory {
    Button createButton();
    TextBox createTextBox();
}
