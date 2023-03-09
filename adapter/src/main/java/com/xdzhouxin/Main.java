package com.xdzhouxin;

public class Main {
    public static void main(String[] args) {
        Target target = new Adaptor(new Adaptee());
        target.request();
    }
}