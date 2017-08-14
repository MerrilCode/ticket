package com.company;
// A child class to the super class AppLauncher
public class StandardTicket extends AppLauncher {
    // Class specific price value for the ticket type
    private int price = 8;
    /* Method that calls the method in the TicketUtil class which implements the discount logic and returns an integer
       value. Arguments to getTicketPrice method in TicketUtil is passed from this method
    */
    public int getStandardTicketPrice()
    {
        return TicketUtil.getTicketPrice(wedDiscount, price, numStandard, dayOfWeek);
    }

}
