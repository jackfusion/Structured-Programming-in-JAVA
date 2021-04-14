/****************************************************************
 * StringMethodDemo.java - example from the book                *
 *                                                              *
 * This program exercises the String class's isEmpty method.    *
*****************************************************************/
import java.util.Scanner;

public class StringMethodDemo {
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String name;            

        System.out.print("Enter you name: ");
        name = stdIn.nextLine();

        while(name.isEmpty())
        {
            System.out.print("Invalid entry. You must enter your name: ");
            name = stdIn.nextLine();
        }
        System.out.println("Hello, " + name + "!");
    }
}
