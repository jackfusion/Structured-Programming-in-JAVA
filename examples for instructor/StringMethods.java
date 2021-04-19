
public class StringMethods {

	public static void main(String[] args) {
		// 2  5
		String pn = "86-131-12345612";
		
		/*
		int firstIndex = pn.indexOf('-');
		int lastIndex = pn.lastIndexOf('-');
		
		System.out.println("country code = " + pn.substring(0, firstIndex));
	 	System.out.println("area code = " + pn.substring(firstIndex + 1, lastIndex)); 
		System.out.println("local phone number = " +  pn.substring(lastIndex + 1) );
		*/
		phone(pn);
		phone2(pn);
	}
	
	public static void phone2(String input) {
		
	 	String[] parts = input.split("-");
	 	
		System.out.println("country code = " + parts[0]);
	 	System.out.println("area code = " + parts[1]);
	 	System.out.println("local phone number = " +  parts[2] );
	}
	
	
	public static void phone(String input) {
		
		String countryCode = "", areaCode = "", 
		phoneNumber = "", unknownPart1 = "", unknownPart2 = "";
		int dashCount = 0;
		
		for (int i = 0; i < input.length(); i++) {
			
			char ch = input.charAt(i);
			
			if(ch == '-') {
				dashCount++;
			}
			else {
				switch(dashCount) {
				case 0: {
					countryCode += ch;
					break;
				}
				case 1: {
					areaCode += ch;
					break;
				}
				case 2: {
					phoneNumber += ch;
					break;
				}	
				case 3: {
					unknownPart1 += ch;
					break;
				}	
				case 4: {
					unknownPart2 += ch;
					break;
				}	
				// default: System.out.println("Invalid value");
				}
			}
		}
		
		System.out.println("country code = " + countryCode);
	 	System.out.println("area code = " + areaCode); 
		System.out.println("local phone number = " +  phoneNumber );
		System.out.println("and " +  unknownPart1 + " " + unknownPart2 );
	}

}
