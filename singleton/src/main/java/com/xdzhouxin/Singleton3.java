package com.xdzhouxin;

/**
 * 双重检测
 * 利用volatile和synchronized关键字解决懒汉式模式的线程安全问题
 * 效率较低
 * 考虑为什么需要volatile关键字
 */
public class Singleton3 {
    private static volatile Singleton3 instance = null;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
