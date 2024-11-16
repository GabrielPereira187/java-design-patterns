package br.com.state.states;

import br.com.state.entities.Coffee;
import br.com.state.interfaces.CoffeeState;

public class DeliverState implements CoffeeState {
    @Override
    public void ready(Coffee coffee) {
        System.out.println("The coffee cant be ready, because is already delivered");
    }

    @Override
    public void prepare(Coffee coffee) {
        System.out.println("The coffee cant be prepared, because is already delivered");
    }

    @Override
    public void deliver(Coffee coffee) {
        System.out.println("The coffee is already delivered");
    }
}
