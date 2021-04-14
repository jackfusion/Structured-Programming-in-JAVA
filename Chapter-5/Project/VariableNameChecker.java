import java.util.Scanner;
public class VariableNameChecker {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String name;                         // User entered name for variable

        Char letter = name.charAt(0);        // used for checking each character in Name

        int legal = 0;                        // 1 - Illegal, 2 - legal, but uses poor style, 3 - good

        System.out.print("Enter a variable name (q to quit):")
        name = stdIn.nextLine();

        //check first character if it is correct or not
        if (char.isUppercase()){
            legal = 1;
        }
        // check each character to see if it is correct meaning if it has a $ for _
        for(int i = 1; i<line.length(); i++)
        if (char.isUppercase())
    }
}