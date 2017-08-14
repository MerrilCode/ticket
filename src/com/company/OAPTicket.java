package com.company;
// See StandardTicket.java for comments
public class OAPTicket extends AppLauncher {


    private int price = 6;

    public int getOAPTicketPrice() {
        return TicketUtil.getTicketPrice(wedDiscount, price, numOAP, dayOfWeek);
    }
}
