/********************************************************************
 * Lottery.java  - example from the book                            *
 *                                                                  *
 * This program asks the user to guess a randomly selected number.  *
*********************************************************************/
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String input;   // user's number guess, or q to quit
        int winningNumber = 
            (int) (Math.random() * Integer.MAX_VALUE + 1);

        System.out.println("Want to win a million dollars?");
        System.out.println("If so, guess the winning number (a number between 1 and " + Integer.MAX_VALUE + ").");
        do
        {
            System.out.print(
                "Insert $1.00 and enter your number or 'q' to quit: ");
            input = stdIn.nextLine();
            if (input.equals("give me a hint"))      //a backdoor
            {
                System.out.println("try: " + winningNumber);
            } else if (!input.equals("q")) {
                if (Integer.parseInt(input) == winningNumber)
                {
                    System.out.println("YOU WIN!");
                    input = "q"; // if someone wins, they're forced to quit
                }else{
                System.out.println("Sorry, good guess, but not quite right.");
                }
            }
        }while (!input.equals("q"));
        System.out.println("Thanks for Playing. Come again!");
    }
}
