package com.himura.singleton;

public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private static int ticket = 1000;

    private TicketMaker() {
        System.out.println("生成了唯一的TicketMaker");
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }
    public synchronized int getTicketNumber() {
        return ticket++;
    }
}
