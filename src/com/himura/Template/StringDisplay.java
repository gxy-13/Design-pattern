package com.himura.Template;

public class StringDisplay extends AbstractDisplay{
    private String string;
    private int width;
    StringDisplay(String string) {
        this.string = string;
        width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void close() {
        printLine();
    }

    public void print() {
        System.out.println("|" + string + "|");
    }

    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i ++) System.out.print("-");
        System.out.println("+");
    }


}
