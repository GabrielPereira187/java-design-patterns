package br.com.static_factory.entity;

import java.math.BigDecimal;

public class Vehicle {
    private String name;
    private double maxVelocity;
    private int totalTyres;

    private Vehicle(String name, double maxVelocity, int totalTyres) {
        this.name = name;
        this.maxVelocity = maxVelocity;
        this.totalTyres = totalTyres;
    }

    public static Vehicle createCar() {
        return new Vehicle("Car", 180, 4);
    }

    public static Vehicle createMotorcycle() {
        return new Vehicle("Motorcycle", 220, 2);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", maxVelocity=" + maxVelocity +
                ", totalTyres=" + totalTyres +
                '}';
    }
}
