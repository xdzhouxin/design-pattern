package com.xdzhouxin;

public class BmwCarFactory implements CarFactory {
    @Override
    public Car buildCar() {
        return new BmwCar();
    }
}
