package com.xdzhouxin;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car benz = carFactory.buildCar("benz");
        benz.run();

        Car bmw = carFactory.buildCar("bmw");
        bmw.run();
    }
}