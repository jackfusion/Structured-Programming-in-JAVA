import java.util.Scanner;


public class CircleParameters {
    public static void main(String[] args) {

        Scanner rad = new Scanner (System.in);
        System.out.print("Enter a radius value: ");
        double circle_radius = rad.nextDouble();
        System.out.println("Diameter: " + (circle_radius * 2));
        System.out.println("Circumference: " + (2 * Math.PI * circle_radius));
        System.out.println("Area: " + ( Math.PI * Math.pow(circle_radius, 2 )));
        rad.close();
    }
}
