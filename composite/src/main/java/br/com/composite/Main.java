package br.com.composite;

import br.com.composite.component.OrderComponent;
import br.com.composite.leaf.Box;
import br.com.composite.leaf.Product;

public class Main {
    public static void main(String[] args) {
        OrderComponent component1 = new Product("P1", 20);
        OrderComponent component2 = new Product("P2", 10);
        OrderComponent component3 = new Product("P3", 5);

        Box box1 = new Box("box1");
        box1.addComponent(component1);
        box1.addComponent(component2);

        Box box2 = new Box("box2");
        box2.addComponent(component1);
        box2.addComponent(component3);

        Box box3 = new Box("box3");
        box3.addComponent(component1);
        box3.addComponent(component2);
        box3.addComponent(component3);

        box1.addComponent(box3);

        double totalPrice = box1.getTotalPrice();

        System.out.println(totalPrice);

    }
}