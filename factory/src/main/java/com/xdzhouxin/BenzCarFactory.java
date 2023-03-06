package com.xdzhouxin;

public class BenzCarFactory implements CarFactory {
    @Override
    public Car buildCar() {
        return new BenzCar();
    }
}
