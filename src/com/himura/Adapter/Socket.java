package com.himura.Adapter;

public class Socket {
    private String name;
    public Socket(String name) {
        this.name = name;
    }

    public void use () {
        System.out.println("use" + name + "的220V");
    }
}
