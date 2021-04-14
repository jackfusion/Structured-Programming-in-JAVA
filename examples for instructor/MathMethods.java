
public class MathMethods {

	public static void main(String[] args) {
		
		double d = 7.51545;
		
		double ceil = Math.ceil(d);
		System.out.println(ceil);
		
		double floor = Math.floor(d);
		System.out.println(floor);
		
		double round = Math.round(d); // 7.51
		System.out.println(round);
		
		/*
		int factor = 100;
		d = d * factor;    // 751.345;
		d = Math.round(d); // 751.0
		d = d / factor;    // 7.51
		*/
		
		System.out.println("d = " + d + " round(d) = " + round(d, 2));
		
	}
	
	public static double round(double value, int places) {
		
		int factor = (int)Math.pow(10, places);
		// value *= factor;  
		value = Math.round(value * factor); 
		value /=  factor;    
		return value;
	}
}