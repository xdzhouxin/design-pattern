package com.xdzhouxin;

public class Factory2 implements Factory {
    @Override
    public ProductA createProductA() {
        return new Factory2ProductA();
    }

    @Override
    public ProductB createProductB() {
        return new Factory2ProductB();
    }
}
