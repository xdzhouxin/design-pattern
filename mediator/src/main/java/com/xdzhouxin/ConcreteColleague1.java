package com.xdzhouxin;

public class ConcreteColleague1 implements Colleague {

    private final Mediator mediator;

    public ConcreteColleague1(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("ConcreteColleague1.receiveMessage: " + message);
    }
}
