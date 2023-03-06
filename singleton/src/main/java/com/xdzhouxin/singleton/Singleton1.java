package com.xdzhouxin.singleton;

/**
 * 饿汉式加载，线程安全
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return instance;
    }
}
