/*************************************************************
* PrintPO.java - example from the book                       *
*                                                            *
* This program calculates and prints a purchase order amount.*
**************************************************************/
import java.util.Scanner;

public class PrintPO 
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        double price;  // price of purchased item
        int qty;       // number of items purchased

        System.out.print("Price of purchase item: ");
        price = stdIn.nextDouble();
        System.out.print("Quantity: ");
        qty = stdIn.nextInt();
        System.out.println("Total purchase order = $" + price * qty);
    }
}
