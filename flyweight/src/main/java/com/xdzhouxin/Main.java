package com.xdzhouxin;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("key1");
        flyweight1.operation();
        Flyweight flyweight2 = factory.getFlyweight("key2");
        flyweight2.operation();
        Flyweight flyweight3 = factory.getFlyweight("key1");
        flyweight3.operation();
    }
}