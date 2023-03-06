package com.xdzhouxin;

public class Product implements Cloneable {

    private int length;

    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    protected Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

    @Override
    public String toString() {
        return "length: " + this.length + " width: " + this.width;
    }
}
