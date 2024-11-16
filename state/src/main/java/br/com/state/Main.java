package br.com.state;

import br.com.state.entities.Coffee;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();

        System.out.println("===PrepareState===");
        //PrepareState
        coffee.deliver();
        coffee.prepare();
        coffee.ready();

        System.out.println("\n\n===ReadyState===");
        //ReadyState
        coffee.prepare();
        coffee.ready();
        coffee.deliver();

        System.out.println("\n\n===DeliverState===");
        //DeliverState
        coffee.deliver();
        coffee.prepare();
        coffee.ready();
    }
}