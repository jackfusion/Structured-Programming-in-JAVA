import java.util.Scanner;

public class VarNameChecker1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
        String line = ""; // user entry
        
        // b.2
        while(true) {

        	System.out.print("Enter a variable name (q to quit): ");
        	line = stdIn.nextLine();
        	if(line.toLowerCase().equals("q")) break;
        	
            switch(varNameChecker(line)) {
	            case -1: System.out.println("Illegal."); break;
	            case 1: System.out.println("Good!"); break;
	            case 0: System.out.println("Legal, but uses poor style."); break;
	            default: 
            }
        }
        
        System.out.println("Have a nice day!");
	}
	
	// b.3
	public static int varNameChecker( String input ) {
		// -1 0 1
		
		
		return -1;
	}
}
