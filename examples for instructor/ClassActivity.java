import java.util.Scanner;

import Helper.*;

public class ClassActivity {
	
	public static void main(String[] args) {
	
		Scanner sn = new Scanner(System.in);
		
		double speed = Checker.enterDoubleUI(sn, "your speed (in mph)");
		double tailgateDistance = Checker.enterDoubleUI(sn, "your tailgate distance (in feet)");
		
		
		System.out.println(speed + " " + tailgateDistance);
		
		
		sn.close();
		
		System.out.println("Have a nice day!");
	}

}
