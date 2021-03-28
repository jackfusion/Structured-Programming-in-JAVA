/********************************************************
* FriendlyHello.java - example from the book           *
*                                                       *
* This program displays a personalized Hello greeting.  *
**********************************************************/
import java.util.Scanner;

public class FriendlyHello {
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String name;
        System.out.print("Enter you Name:");
        name = stdIn.nextLine();
        System.out.println("Hello " + name + "!");
    }
    
}
