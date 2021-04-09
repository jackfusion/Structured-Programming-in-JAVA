/********************************************************
 * GarageDoor.java - example from the book              *
 *                                                      *
 * This simulates the operation of a garage door opener.*
*********************************************************/
import java.util.Scanner;

public class GarageDoor 
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String entry;                // user's entry - enter key of q
        boolean upDirection = true; // Is the current direction up?
        boolean inMotion = false;    // Is garage door currently moving?

        System.out.println("GARAGE DOOR OPENER SIMULATOR\n");

        do
        {
            System.out.print("Press Enter, or enter 'q' to quit: ");
            entry = stdIn.nextLine();
            while (!entry.equals("") && !entry.equalsIgnoreCase("q"))
            {
                System.out.println("Invalid entry.");
                System.out.print("Press Enter, or enter 'q' to quit: ");
                entry = stdIn.nextLine();
            }

            if (entry.equals(""))    // pressing Enter generates ""
            {
                inMotion = !inMotion;
                if (inMotion)
                {
                    if (upDirection)
                    {
                        System.out.println("moving up");
                    }
                    else
                    {
                        System.out.println("moving down");
                    }
                }
                else
                {
                    System.out.println("stopped");
                    upDirection = !upDirection;  // direction reverses at stop
                }
            }
        }while (entry.equals(""));
    }
}
