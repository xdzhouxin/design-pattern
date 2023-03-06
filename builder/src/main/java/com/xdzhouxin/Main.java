package com.xdzhouxin;

public class Main {
    public static void main(String[] args) {
        Product product = new ProductBuilder()
                .length(1)
                .width(2)
                .high(3)
                .build();
        System.out.println(product.toString());
    }
}