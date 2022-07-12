package com.himura.Adapter;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Adapter("一号插座");
        laptop.use();
    }
}
