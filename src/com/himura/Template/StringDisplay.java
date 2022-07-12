package com.himura.Template;

public class StringDisplay extends AbstractDisplay{
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    public void open() {
        System.out.println("x" + string + "x");
    }
}
