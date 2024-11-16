package br.com.state.states;

import br.com.state.entities.Coffee;
import br.com.state.interfaces.CoffeeState;

public class PrepareState implements CoffeeState {
    @Override
    public void ready(Coffee coffee) {
        System.out.println("The coffee is not ready");
        coffee.setState(new ReadyState());
    }

    @Override
    public void prepare(Coffee coffee) {
        System.out.println("Starting the coffee preparation");
    }

    @Override
    public void deliver(Coffee coffee) {
        System.out.println("The coffee cant be delivered because is not ready");
    }
}
