/************************************************************************************
 * Triangles.java                                                                   *
 * Ken DeWitt                                                                       *
 *                                                                                  *
 * The purpose of program is to print * into a triangle based user requested size   *
*************************************************************************************/
import java.util.Scanner;
import Helper.*;

public class Triangles 
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int numberOfTimes = Checker.enterIntUI(stdIn, "the size of the equal sides in an isosceles triangle ");
    
        for (int y = 0; y < numberOfTimes; y++) {
            for (int x = 0; x < numberOfTimes; x++) {
                
                if(x <= y){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();    
        }
    }
}