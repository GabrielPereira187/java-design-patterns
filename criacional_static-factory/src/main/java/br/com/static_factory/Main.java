package br.com.static_factory;

import br.com.static_factory.entity.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = Vehicle.createCar();

        Vehicle motorcycle = Vehicle.createMotorcycle();

        System.out.println(car);
        System.out.println(motorcycle);
    }
}