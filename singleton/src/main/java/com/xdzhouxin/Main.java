package com.xdzhouxin;

public class Main {
    public static void main(String[] args) {

        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton11 = Singleton1.getInstance();

        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton2 singleton22 = Singleton2.getInstance();


        Singleton3 singleton3 = Singleton3.getInstance();
        Singleton3 singleton33 = Singleton3.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton11);
        System.out.println(singleton2);
        System.out.println(singleton22);
        System.out.println(singleton3);
        System.out.println(singleton33);


    }
}