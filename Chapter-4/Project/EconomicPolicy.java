/****************************************************************************
 * EconomicPolicy.java                                                      *
 * Ken DeWitt                                                               *
 *                                                                          *
 * The purpose of this program is to display what economic policy to apply  *
 * depnding on the growth rate and inflation rate.                          *
*****************************************************************************/
import java.util.Scanner;
import Helper.*;

public class EconomicPolicy 
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        
        double growthRate;   // Annual growth rate for the economy
        double inflation;    // Annual inflation rate for the economy

        growthRate = Checker.enterDoubleUI(stdIn, "What is the current economic growth rate for the year? ");
        inflation = Checker.enterDoubleUI(stdIn, "What is the current inflation rate? ");

        if (growthRate < 1)
        {
            if (inflation < 3)
            {
                System.out.println("It is recommended to Increase welfare spending, reduce personal taxes, and descrease discount rate.");
            }else {
                System.out.println("It is recommended to Reduce business taxes.");
            }
        }else if (growthRate > 4)
        {
            if (inflation < 1)
            {
                System.out.println("It is recommended to Increase personal and business taxes.");
            }else if (inflation > 3) 
            {
                System.out.println("It is recommended Increase the discount rate.");
            }
        } else
        {
            System.out.println("No change in economic policy.");
        }
        stdIn.close();
    }
}
