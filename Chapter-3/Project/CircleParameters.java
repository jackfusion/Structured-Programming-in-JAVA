/****************************************************************************
* CircleValues.java                                                         *
* Ken DeWitt                                                                *
*                                                                           *
* The purpose of this program is to calculate the diameter, circumference   *
* and area of a circle                                                      *
*****************************************************************************/
import java.util.Scanner;

public class CircleParameters {
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        double radius;          // the starting value for the radius of a circle
        
        System.out.print("Enter a radius value: ");
        radius = stdIn.nextDouble();
        System.out.println("Diameter = " + radius * 2);
        System.out.println("Circumference = " + 2 * radius * Math.PI);
        System.out.println("Area = " + Math.PI * (radius * radius));
    }
    
}
