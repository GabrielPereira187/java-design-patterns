package br.com.prototype.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaidVersion extends SoftwareVersion{
    private double price;

    public PaidVersion(SoftwareVersion base) {
        super(base.getName(), new ArrayList<>(base.getAvailableFunctionalities()));
        this.price = 100;
        this.addFunctionality("100GB Limit");
        this.addFunctionality("Premium Design");
    }

    @Override
    public String toString() {
        return "PaidVersion{" +
                "name='" + getName() + '\'' +
                ", functionalities=" + getAvailableFunctionalities() +
                ", price=" + this.getPrice()+
                '}';
    }

    public double getPrice() {
        return price;
    }
}
