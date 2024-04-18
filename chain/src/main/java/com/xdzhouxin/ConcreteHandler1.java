package com.xdzhouxin;

public class ConcreteHandler1 implements Handler {

    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals("type1")) {
            System.out.println("ConcreteHandler1 handle request: " + request.getRequestType());
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}
