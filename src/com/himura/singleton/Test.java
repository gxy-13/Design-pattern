package com.himura.singleton;

public class Test {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if(instance1==instance2){
            System.out.println("生成的为单例对象");
        } else  {
            System.out.println("生成的不是单例对象");
        }
    }
}
