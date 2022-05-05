package com.himura.singleton;

// 最多只能生成三个Triple实例,通过id 1，2，3获取相应的实例
public class Triple {
    private static Triple[] triple = new Triple[]{
            new Triple(),
            new Triple(),
            new Triple(),
    };
    private Triple(){}

    public static Triple getInstance(int index) {
        return triple[index-1];
    }
}
