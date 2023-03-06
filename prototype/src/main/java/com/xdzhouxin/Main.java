package com.xdzhouxin;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product product = new Product();
        Product clone = product.clone();
        product.setLength(10);
        product.setWidth(100);
        System.out.println(product);
        System.out.println(clone);

        clone.setLength(20);
        clone.setWidth(200);
        System.out.println(product);
        System.out.println(clone);
    }
}