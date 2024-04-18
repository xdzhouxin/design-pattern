package com.xdzhouxin;

public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adaptor(adaptee);
        target.request();
    }
}