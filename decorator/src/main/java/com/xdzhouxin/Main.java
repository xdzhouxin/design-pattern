package com.xdzhouxin;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component componentA = new ConcreteDecoratorA(component);
        componentA.operation();
        System.out.println("----------");
        Component componentB = new ConcreteDecoratorB(componentA);
        componentB.operation();
    }
}