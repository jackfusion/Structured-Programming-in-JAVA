import java.util.Scanner;

public class DecibelMath {
    public static void main(String[] args){
        double dB1;
        double dB2;
        double combinedDB;
        Scanner stdIn = new Scanner(System.in);
        System.out.print("Enter first Decibel: ");
        dB1 = stdIn.nextDouble();
        System.out.print("Enter second Decibel: ");
        dB2 = stdIn.nextDouble();
        combinedDB = Math.pow(10, dB1 / 10)+Math.pow(10, dB2 / 10);
        System.out.println("Combination decibal level = " + 10 * Math.log10(combinedDB) + " dB");

    }
}
