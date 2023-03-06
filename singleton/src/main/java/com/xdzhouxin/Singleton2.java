package com.xdzhouxin;

/**
 * 懒汉式，非线程安全，用到时才加载
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
            return instance;
        }
        return instance;
    }
}
