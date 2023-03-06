package com.xdzhouxin;

public class Product {
    public Integer length;

    public Integer width;

    public Integer high;

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    @Override
    public String toString() {
        String str = "product: \n";

        if (this.length != null) {
            str += "length: " + this.length + "\n";
        }
        if (this.width != null) {
            str += "width: " + this.width + "\n";
        }
        if (this.high != null) {
            str += "high: " + this.high + "\n";
        }


        return str;
    }
}
