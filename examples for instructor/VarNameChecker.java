import java.util.Scanner;

public class VarNameChecker {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
        String line = stdIn.nextLine();            // user entry
        // boolean legal = true;
        int legal = 0; // -1 - Illegal, 1 - good, 0 - poor styled 
        
        // b.2
        while(true) {
        	if(line.toLowerCase().equals("q")) break;
        	
        	line = stdIn.nextLine();
        }
        
         // b.1
        switch(legal) {
        case -1: /* do something for Illegal */ break;
        case 1: /* do something for good */ break;
        case 0: /* do something for poorstyled */ break;
        default: 
        }
        
        if(legal == 1) { // Good
        	
        }
        else if (legal == -1) { // Illegal
        	
        }
        else if (legal == 0) { // poor styled
        	
        }
        else {
        	
        } 
        
        System.out.println("Have a nice day!");
	}

}
