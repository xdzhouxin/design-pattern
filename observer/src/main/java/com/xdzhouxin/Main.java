package com.xdzhouxin;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver1 observer = new ConcreteObserver1();
        subject.registerObserver(observer);
        subject.notifyObservers("Hello, I am subject.");
    }
}