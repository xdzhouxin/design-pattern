package com.xdzhouxin;

public class CarFactory {
    public Car buildCar(String type) {
        if ("benz".equals(type)) {
            return new BenzCar();
        } else if ("bmw".equals(type)) {
            return new BmwCar();
        }
        throw new UnsupportedOperationException();
    }
}
