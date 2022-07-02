package com.himura.Template;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay c  = new CharDisplay('C');
        AbstractDisplay str = new StringDisplay("HELLO");
        c.display();
        str.display();
    }
}
