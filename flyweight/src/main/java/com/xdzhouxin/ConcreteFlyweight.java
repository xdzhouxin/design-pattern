package com.xdzhouxin;

public class ConcreteFlyweight implements Flyweight {
    @Override
    public void operation() {
        System.out.println("ConcreteFlyweight.operation()" + this.hashCode());
    }
}
