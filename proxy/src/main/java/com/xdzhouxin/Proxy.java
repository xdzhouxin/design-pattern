package com.xdzhouxin;

public class Proxy {
    private final RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    public void request() {
        System.out.println("Proxy request");
        realSubject.request();
    }
}
