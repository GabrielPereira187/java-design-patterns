package br.com.state.entities;

import br.com.state.interfaces.CoffeeState;
import br.com.state.states.PrepareState;

public class Coffee {
    private CoffeeState coffeeState;

    public Coffee() {
        this.coffeeState = new PrepareState();
    }

    public void deliver() {
        coffeeState.deliver(this);
    }

    public void prepare() {
        coffeeState.prepare(this);

    }

    public void ready() {
        coffeeState.ready(this);
    }

    public void setState(CoffeeState state) {
        this.coffeeState = state;
    }
}
