package com.himura.singleton;

public class Singleton {
    // singleton对象尽在类被加载时初始化一次
    private static  Singleton singleton = new Singleton();
    // 将构造器设置为private 防止外部调用构造函数生成实例
    private Singleton() {
        System.out.println("生成了一个单例对象");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
