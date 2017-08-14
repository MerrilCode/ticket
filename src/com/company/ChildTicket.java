package com.company;
// See StandardTicket.java for comments
public class ChildTicket extends AppLauncher {

    private int price = 4;

    public int getChildTicketPrice() {
        return TicketUtil.getTicketPrice(wedDiscount, price, numChild, dayOfWeek);
    }
}
