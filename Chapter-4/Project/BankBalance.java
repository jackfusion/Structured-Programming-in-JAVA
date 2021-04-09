/*****************************************************************************************
 * BankBalance.java                                                                      *
 * Ken DeWitt                                                                            *
 *                                                                                       *
 * The purpose of this program is to figure out how long it takes to get to 1 million in *
 * a bank account if the account balance is doubled each year.                           *
******************************************************************************************/
import java.util.Scanner;

import Helper.*;

public class BankBalance 
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int year = 0;       // Years to as place holder to figure out how many year to 1 mil
        double bankBalance; // Bank balance
        String alive;

        bankBalance = Checker.enterDoubleUI(stdIn, "How much would you like to deposit into your account?");
        System.out.print("Is customer still alive? (y/n) ?");
        alive = stdIn.next();
        //alivebool = alive.equals("y") ? true : false;
        if (alive.equals("n"))
        {
            System.out.println("The full bank balance of " + bankBalance + " will go to the bank.");
        }

        while (bankBalance <= 100_000 && alive.equals("y")){
            year ++;
            bankBalance = bankBalance * 2;
        }
        System.out.println("It takes " + year + " years to reach $100,000");
        while (bankBalance <= 1_000_000 && alive.equals("y"))
        {
            year ++;
            bankBalance = bankBalance * 2;
        }
            System.out.println("It takes " + year + " years to reach $1,000,000");
        
    }
}