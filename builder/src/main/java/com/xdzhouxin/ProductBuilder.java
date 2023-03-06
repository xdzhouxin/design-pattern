package com.xdzhouxin;

public class ProductBuilder {
    private final Product product = new Product();

    public ProductBuilder length(Integer length) {
        product.setLength(length);
        return this;
    }

    public ProductBuilder width(Integer width) {
        product.setWidth(width);
        return this;
    }

    public ProductBuilder high(Integer high) {
        product.setHigh(high);
        return this;
    }

    public Product build() {
        return this.product;
    }

}
