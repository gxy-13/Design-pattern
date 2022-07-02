package com.himura.singleton;

public class SingletonTest {
    private static SingletonTest singletonTest = new SingletonTest();

    private SingletonTest() {
        System.out.println("生成了一个单实例对象");
    }

    public SingletonTest getInstance() {
        return singletonTest;
    }
}
