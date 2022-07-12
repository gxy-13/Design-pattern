package com.himura.Template;

public abstract class AbstractDisplay {
    protected abstract void open();
    public void print() {
        for (int i = 0; i < 2; i ++) open();
    }
}
