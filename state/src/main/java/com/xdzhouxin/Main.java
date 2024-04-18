package com.xdzhouxin;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println("Count: " + context.getCount());
    }
}