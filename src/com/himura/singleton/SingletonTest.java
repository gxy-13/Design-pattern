package com.himura.singleton;

public class SingletonTest {
    private static SingletonTest singletonTest = new SingletonTest();
    private SingletonTest() {}
    public static  SingletonTest getInstance() {
        return singletonTest;
    }
}
