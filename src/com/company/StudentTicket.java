package com.company;
// See StandardTicket.java for comments
public class StudentTicket extends AppLauncher {
    private int price = 6;

    public int getStudentTicketPrice() {
        return TicketUtil.getTicketPrice(wedDiscount, price, numStudent, dayOfWeek);
    }
}
