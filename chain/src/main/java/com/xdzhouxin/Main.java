package com.xdzhouxin;

public class Main {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler1);

        Request request1 = new Request("type1");
        Request request2 = new Request("type2");

        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
    }
}