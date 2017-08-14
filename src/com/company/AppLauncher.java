package com.company;
import java.util.Calendar;
import  java.util.Scanner;
/* This is the super class where the static variables available to the child classes are initialised and stored.
User inputs for the number of tickets for each child class is stored in variables as type int. User inputs are checked
for exceptions before the user can enter the next value. Day of the week is initialised to the current day to check for
discount applicable on Wednesdays. An instance of each child class is also created to return the total ticket price from
each child class, such that the total price for the movie can be calculated. A child class is created for each ticket
type.

 */
public class AppLauncher {
/* Declaring and initializing the number of tickets for each type of ticket. Variables initialized to -1 to apply the
  logic for exception handling
  */

    static int numStandard = -1;
    static int numOAP = -1;
    static int numStudent= -1;
    static int numChild = -1;
    protected int wedDiscount = 2;
    static boolean displayErrorMessage;
// Setting the day of week to current day
    int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);


    public static void main(String[] args) {
/* Creating an object of the super class and calling readNext method to handle exceptions if the inputs by the user are not
    inter values. The while loop asserts if readNext returns false and the if statement print an error message if the
    user does not input an integer value.
  */
        AppLauncher launcher = new AppLauncher();

        while (!launcher.readNext())
        {
            if(displayErrorMessage)
            {
                System.out.println("Please enter an integer next time ");
            }
        }
// An instance of each child class is created.
        StandardTicket stand = new StandardTicket();
        OAPTicket oap = new OAPTicket();
        StudentTicket student = new StudentTicket();
        ChildTicket child = new ChildTicket();

// Printing out the total price for the movie, summing the total from each child objects
        int orderPrice = stand.getStandardTicketPrice()+oap.getOAPTicketPrice()+ student.getStudentTicketPrice()+child.getChildTicketPrice();
        System.out.println("The total cost of tickets for this movie is: " + orderPrice);
    }

    private boolean readNext()

    {/* disPlayErrorMessage is set to true before the user input and once each of the variables declared for storing the
        number of tickets is initialised to a value greater than -1, the scanner waits for next user input and the
        displayErrorMessage is set to false.
       */
        displayErrorMessage =true;
        Scanner scanner = new Scanner(System.in);
            if(numStandard < 0) {
                System.out.println("Please enter number of Standard tickets: ");
                if (scanner.hasNextInt())
                {
                    numStandard = scanner.nextInt();
                    displayErrorMessage =false;
                }
            }else if (numStudent<0) {
                System.out.println("Please enter number of Student tickets: ");
                if (scanner.hasNextInt())
                {
                    numStudent = scanner.nextInt();
                    displayErrorMessage = false;
                }

            }else if(numOAP<0){
                System.out.println("Please enter number of OAP tickets: ");
                if (scanner.hasNextInt())
                {
                    numOAP = scanner.nextInt();
                    displayErrorMessage = false;
                }

            }else if(numChild<0) {
                System.out.println("Please enter number of Child tickets ");
                if (scanner.hasNextInt())
                {
                    numChild = scanner.nextInt();
                    displayErrorMessage = false;
                }
            }
            /* Checking if all the variables for number of tickets is greater than -1, and returns true or false which
              is used in the while loop above
              */

            return  numStandard > -1 && numOAP > -1 && numStudent > -1 && numChild > -1;
    }

}
