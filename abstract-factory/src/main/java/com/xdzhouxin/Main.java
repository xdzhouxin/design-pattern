package com.xdzhouxin;

public class Main {
    public static void main(String[] args) {
        Factory factory1 = new Factory1();
        ProductA factory1ProductA = factory1.createProductA();
        factory1ProductA.print();

        ProductB factory1ProductB = factory1.createProductB();
        factory1ProductB.print();

        Factory factory2 = new Factory2();
        ProductA factory2ProductA = factory2.createProductA();
        factory2ProductA.print();

        ProductB factory2ProductB = factory2.createProductB();
        factory2ProductB.print();

    }
}