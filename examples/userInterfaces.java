import java.util.Scanner;

public class userInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);
		
		//int somethingInt = enterIntUI(sn, "starting balance");
		//int somethingInt2  = enterIntUI(sn, "radius");
		//int somethingInt3  = enterIntUI(sn, "speed (km/h)");
		 
		
		// System.out.println(somethingInt + " " + somethingInt2 + " " + somethingInt3);
		
		sn.close();
		
		String value = "";
		
		double resDouble = Double.parseDouble(value);
		
		System.out.println("resDouble = ");
		
		System.out.println("Have a nice day!");
	}
	
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
		
		for(int j = 0; j < value.length(); ++j) {
			
			if( value.charAt(j) < '0' || value.charAt(j) > '9' ) {
				return false;
			}
		}
		
		return true;
	} 
	
	public static boolean doubleChecker(String value) {
		
		// '.'
		// 1. if count('.') > 1 -> false
		for(int j = 0; j < value.length(); ++j) {

			if(value.charAt(j) == .) {
				System.out.println("Enter vaild double");
			}

		}
		
		// 2. count('.') == 1 and value.length == 1 -> false 
		// || value == "."  -> false
		
		// 3. for()  if not '.' and (not digit) - > false
		
		return true;
	}
}
