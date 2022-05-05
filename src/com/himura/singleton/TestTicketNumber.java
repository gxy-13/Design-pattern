package com.himura.singleton;

public class TestTicketNumber {
    public static void main(String[] args) {
        TicketMaker instance = TicketMaker.getInstance();
        TicketMaker instance2 = TicketMaker.getInstance();
        int ticketNumber = instance.getTicketNumber();
        System.out.println(ticketNumber);
        System.out.println(instance2.getTicketNumber());
    }
}
