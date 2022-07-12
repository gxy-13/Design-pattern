package com.himura.Adapter;

public class Adapter extends Laptop{
    private Socket socket;
    public Adapter (String name) {
        socket = new Socket(name);
    }

    public void use () {
        socket.use();
    }
}
