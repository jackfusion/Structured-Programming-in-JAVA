import java.util.Scanner;

public class PhoneNumberDissector {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print(
				"Enter a phone number in the form cc-area-local, where cc = country code digits, area = area code"
				+ "\ndigits, and local = local phone digits." + "\nOr enter q to quit: ");
		String phoneNumber = stdIn.nextLine();

		while (true) {
			if (phoneNumber.toLowerCase().equals("q"))
				break;
		}
		
		phone(phoneNumber);
	}
	
	public static void phone(String input) {

		String countryCode = "", areaCode = "", phoneNumber = "", unknownPart1 = "", unknownPart2 = "";
		int dashCount = 0;

		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);

			if (ch == '-') {
				dashCount++;
			} else {
				switch (dashCount) {
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
		System.out.println("local phone number = " + phoneNumber);
	}

}
