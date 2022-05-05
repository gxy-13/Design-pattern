package com.himura.singleton;

public class TripleTest {
    public static void main(String[] args) {
        Triple triple1 = Triple.getInstance(1);
        Triple triple2 = Triple.getInstance(2);
        Triple triple3 = Triple.getInstance(3);
        System.out.println(triple1==triple2);
        System.out.println(triple1==triple3);
        System.out.println(triple2==triple3);
    }
}
