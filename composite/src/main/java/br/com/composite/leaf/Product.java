package br.com.composite.leaf;

import br.com.composite.component.OrderComponent;

public class Product implements OrderComponent {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public double getTotalPrice() {
        return this.price;
    }
}
