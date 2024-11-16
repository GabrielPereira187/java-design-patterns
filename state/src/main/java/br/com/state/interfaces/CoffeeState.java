package br.com.state.interfaces;

import br.com.state.entities.Coffee;

public interface CoffeeState {
    void ready(Coffee coffee);
    void prepare(Coffee coffee);
    void deliver(Coffee coffee);
}
