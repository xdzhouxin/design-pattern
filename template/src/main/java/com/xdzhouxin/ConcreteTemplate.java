package com.xdzhouxin;

public class ConcreteTemplate extends AbstractTemplate {
    @Override
    protected void primitiveOperation1() {
        System.out.println("ConcreteTemplate.primitiveOperation1()");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("ConcreteTemplate.primitiveOperation2()");
    }
}
