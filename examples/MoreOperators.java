
public class MoreOperators {

	public static void main(String[] args) {

		// ? :
		int a = 7;
		String str = (a >= 10) ? "a is greater than or equal to 10" : "a is less than 10";
		
		/*
		if(a >= 10) {
			str = "a is greater than or equal to 10";
		}
		else {
			str = "a is less than 10";
		}
		*/
		
		int val1 = 77, val2 = 20;
		boolean isMore =  val1 > val2;
		
		int max = isMore ? val1 : val2;
		int min = isMore ? val2 : val1;
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		// abs()
		System.out.println(Math.abs(-77));
		
		int val3 = 0;
		
		int abs = val3 > 0 ? val3 : -val3;
		
		System.out.println( "abs = " + abs );
		
		// max of three numbers
		int x = 97;
		int y = 71; // <-
		int z = -80;
		
		/*
		int largestNumber;
		
		if(x > y && x > z) {
			System.out.println("x");
			largestNumber = x;
		}
		else if(y > z) {
			System.out.println("y");
			largestNumber = y;
		}
		else {
			System.out.println("z");
			largestNumber = z;
		}
		*/
		
		// int largestNumber = () ? : ;
		
		// Solution #1
		//int largestNumber = (Math.max(x , y) > z)  ?  Math.max(x, y) : z ;
		
		// int largestNumber = (x > y)  ?  Math.max(x, z) : Math.max(y, z);
		
		int largestNumber = (x > y) ? ( x > z ? x : z ) : ( y > z ? y : z );
		
		System.out.println( "largestNumber = " + largestNumber );
		
		// method(a, b, sign) sign: + - * / ^ js: **
		
		System.out.println( " + " + calculator2(15, 3, '+') );
		System.out.println( " - " + calculator2(15, 3, '-') );
		System.out.println( " * " + calculator2(15, 3, '*') );
		System.out.println( " / " + calculator2(15, 3, '/') );
		System.out.println( " ^ " + calculator2(15, 3, '^') );
		
		System.out.println( " ^ " + calculator2(15, 3, '$') );
	}
	
	public static double calculator(double a, double b, char sign) {
		
		double res = 0;
		
		switch(sign) {
			
			case '+': {
				res = a + b;
				break;
			}
			case '-': {
				res = a - b;
				break;
			}		
			case '*': {
				res = a * b;
				break;
			}
			case '/': {
				res = a / b;
				break;
			}
			case '^': {
				res = Math.pow(a, b);
				break;
			}		
			default: {
				System.out.println("Unknown operator");
				res = -1;
			}
		}
		
		
		return res;
	}
	
	public static double calculator2(double a, double b, char sign) {
		
		switch(sign) {
			
			case '+': return a + b;
			case '-': return a - b;	
			case '*': return a * b;
			case '/': return a / b;
			case '^': return Math.pow(a, b);
			
			default: {
				System.out.println("Unknown operator");
				return -1;
			}
		}
	}

}
