package Helper;

import java.util.Scanner;

public class Checker {
	
	public static int enterIntUI(Scanner sn, String message) {
		
		String userInput = "";
		int res = -1;
		
		System.out.println("Enter " + message + ": ");
		
		 do {
			userInput = sn.nextLine();
			
			if(intChecker(userInput)) {
				res = Integer.parseInt(userInput);
			}
			else {
				System.out.println("Incorrrect value. Please, re-enter " 
									+ message + ": ");
			}
		
		} while(!intChecker(userInput));
		
		return res;
	}
	
	public static boolean intChecker(String value) {
		
		for(int j = 0; j < value.length(); ++j) { // j++
			
			if( value.charAt(j) < '0' || value.charAt(j) > '9' ) {
				return false;
			}
		}
		
		return true;
	} 
	
	public static int countChar(String input, char c) {
		
		int count = 0;
		
		for(int i = 0; i < input.length(); ++i) {
			
			if(input.charAt(i) == c){
				count++;	
			}
		}
		
		return count;
	}
	
	
	public static boolean doubleChecker(String value) {
		

		if(countChar(value, '.') > 1)  {return false;}
		
		if(value == ".") {return false;}
		
		for( int k = 0; k < value.length(); k++){

			if( value.charAt(k) != '.' 
					&& (value.charAt(k) < '0' || value.charAt(k) > '9') ) {
				return false;
			}
		}

		return true;
	}
	
	public static double enterDoubleUI(Scanner sn, String message) {
		
		String userInput = "";
		double res = -1;
		
		System.out.println("Enter " + message + ": ");
		
		 do {
			userInput = sn.nextLine();
			
			if(intChecker(userInput)) {
				res = Double.parseDouble(userInput);
			}
			else {
				System.out.println("Incorrrect value. Please, re-enter " 
									+ message + ": ");
			}
		
		} while(!intChecker(userInput));
		
		return res;
	}
}
