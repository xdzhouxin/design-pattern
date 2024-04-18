package com.xdzhouxin;

public class Invoker {
    private final Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("Invoker call");
        command.execute();
    }
}
