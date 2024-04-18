package com.xdzhouxin;

public class Context {
    private State state;

    private Integer count;

    public Context() {
        state = new StopState();
        count = 0;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void start() {
        state = new StartState();
        state.doAction(this);
    }

    public void stop() {
        state = new StopState();
        state.doAction(this);
    }
}
