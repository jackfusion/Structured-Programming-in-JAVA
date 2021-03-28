/****************************************************************
* PrintInitials2.java - example from the book                   *
*                                                               *
* This prints leading character of first two words in a file.   *
*****************************************************************/
import java.util.Scanner;
import java.io.file;

public class PrintInitials 
{
    public static void main(String[] args) throws Exception
    {
//        Scanner stdIn = new Scanner(System.in);
        Scanner stdIn = new Scanner(new file("name.txt"));
        String first;  // First Name
        String last;   // Last name
//        System.out.print(
//            "Enter your first and last name separated by a space: ");
            first = stdIn.next();
            last = stdIn.next();
            System.out.println("Your initials are " + first.charAt(0) + last.charAt(0) + ".");
    }
}

