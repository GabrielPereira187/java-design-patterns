package br.com.state.states;

import br.com.state.entities.Coffee;
import br.com.state.interfaces.CoffeeState;

public class ReadyState implements CoffeeState {
    @Override
    public void ready(Coffee coffee) {
        System.out.println("The coffee is ready");
    }

    @Override
    public void prepare(Coffee coffee) {
        System.out.println("Coffee is not preparing because its ready");
    }

    @Override
    public void deliver(Coffee coffee) {
        System.out.println("Coffee can be delivered");
        coffee.setState(new DeliverState());
    }
}
