/************************************************************
* PrintInitials.java - example from the book                *
*                                                           *
* This program prints the initials for a user-entered name. *
**************************************************************/
import java.util.Scanner;

public class PrintInitials 
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String first;  // First Name
        String last;   // Last name
        System.out.print(
            "Enter your first and last name separated by a space: ");
            first = stdIn.next();
            last = stdIn.next();
            System.out.println("Your initials are " + first.charAt(0) + last.charAt(0) + ".");
    }
}
