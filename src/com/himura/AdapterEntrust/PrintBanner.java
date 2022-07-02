package com.himura.AdapterEntrust;

public class PrintBanner extends Print{

    private Banner banner;

    public PrintBanner(String string) {
        banner = new Banner(string);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
