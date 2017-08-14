package com.company;

import java.util.Calendar;
/* The logic class that implements the discount for Tickets purchased on Wednesday.

 */
public class TicketUtil {
    /* getTicketPrice takes in four integer values from the ticket type classes and applies the logic for calculating
    the discount using the arguments to the method. This method is used in all child classes (ticket types) of the super
    class (AppLauncher).

     */

    public static int getTicketPrice(int discount, int ticketPrice, int numberOfTickets, int dayOfWeek){

        int totalDiscount = discount * numberOfTickets;
        int totalPrice = numberOfTickets * ticketPrice;
        if(dayOfWeek == Calendar.WEDNESDAY){

            totalPrice = totalPrice - totalDiscount;
        }
        return totalPrice;
    }
}
