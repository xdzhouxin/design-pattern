package com.xdzhouxin;

public class Main {
    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplate();
        template.templateMethod();
    }
}