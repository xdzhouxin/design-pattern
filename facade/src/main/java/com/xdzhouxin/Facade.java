package com.xdzhouxin;

public class Facade {
    private final SubSystemA subSystemA;
    private final SubSystemB subSystemB;

    public Facade() {
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
    }

    public void operation() {
        subSystemA.operationA();
        subSystemB.operationB();
    }
}
