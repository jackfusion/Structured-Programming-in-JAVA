import java.util.Scanner;
public class VariableNameChecker {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String line; // user entry
        
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
    }
    public static int varNameChecker( String input ) {
		// -1 0 1

		int res = 1; 
		char ch = input.charAt(0);
		
		if( !(Character.isLetter(ch) || ch == '$' || ch == '_') ) {
			res = -1;
		}
		
		if( Character.isLetter(ch) && Character.isUpperCase(ch) ) {
			res = 0;
		}

		for (int i = 1; i < input.length(); i++)
		{
			ch = input.charAt(i);
			
			if( !(Character.isLetterOrDigit(ch) || ch == '$' || ch == '_')  ) {
				res = -1;
			}
			
			if( ch == '$' || ch == '_') {
				res = 0;
			}
		}

		return res;
		}
}