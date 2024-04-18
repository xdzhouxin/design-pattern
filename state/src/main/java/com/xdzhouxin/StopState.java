package com.xdzhouxin;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        context.setState(this);
        context.setCount(context.getCount() - 1);
        System.out.println("Player is in stop state");
    }
}
