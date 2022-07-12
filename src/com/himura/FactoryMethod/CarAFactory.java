package com.himura.FactoryMethod;

public class CarAFactory extends Factory{

    public Car create() {
        System.out.println("create a CarA");
        return new CarA();
    }
}
