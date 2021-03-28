/********************************************************************
* OneHunderBirthday.java                                            *
* Ken DeWitt                                                        *
*                                                                   *
* Purpose of the is program is to give your birthday in 100 years   *
*********************************************************************/
import java.util.Scanner;

public class OneHunderBirthday {
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int date;        // The date you are born
        int year;       // The year you are born
        String month;   // The month you are born

        System.out.print("Enter the month you were born: ");
        month = stdIn.nextLine();
        System.out.print("Enter the day you were born: ");
        date = stdIn.nextInt();
        System.out.print("Enter the year were born: ");
        year = stdIn.nextInt();
        System.out.println("You will be 100 on " + month + " " + date + ", " + (year += 100));
    }
}
