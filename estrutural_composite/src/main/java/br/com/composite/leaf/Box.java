package br.com.composite.leaf;

import br.com.composite.component.OrderComponent;

import java.util.ArrayList;
import java.util.List;

public class Box implements OrderComponent {
    private String name;
    private List<OrderComponent> boxes = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public void addComponent(OrderComponent component) {
        boxes.add(component);
    }

    public void removeComponent(OrderComponent component) {
        boxes.remove(component);
    }

    @Override
    public double getTotalPrice() {
        System.out.println("Caixa: " + name);

        double totalPrice = 0.0;
        for(OrderComponent orderComponent: boxes) {
            totalPrice += orderComponent.getTotalPrice();
        }

        System.out.printf("Total %s = %.2f\n", name, totalPrice);

        return totalPrice;
    }


}
