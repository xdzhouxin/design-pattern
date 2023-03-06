package com.xdzhouxin;

public class Main {
    public static void main(String[] args) {
        CarFactory benzCarFactory = new BenzCarFactory();
        benzCarFactory.buildCar().run();

        CarFactory bmwCarFactory = new BmwCarFactory();
        bmwCarFactory.buildCar().run();
    }
}