package com.xdzhouxin;

public class Factory1 implements Factory {
    @Override
    public ProductA createProductA() {
        return new Factory1ProductA();
    }

    @Override
    public ProductB createProductB() {
        return new Factory1ProductB();
    }
}
