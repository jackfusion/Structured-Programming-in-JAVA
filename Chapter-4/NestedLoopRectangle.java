/********************************************************
 * NestedLoopRectangle.java - example from the book     *
 *                                                      *
 * This program uses nested looping to draw a rectangle.*
*********************************************************/
import java.util.Scanner;

public class NestedLoopRectangle 
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int height, width;          // rectangle's dimensions
        char printCharater;

        System.out.print("Enter height: ");
        height = stdIn.nextInt();
        System.out.print("Enter width: ");
        width = stdIn.nextInt();
        System.out.print("Enter character: ");
        printCharater = stdIn.next().charAt(0);

        for (int row=1; row<=height; row++)
        {
            for (int col=1; col<=width; col++)
            {
                System.out.print(printCharater);
            }
            System.out.println();
        }
    }
}
