//alphabet count lower or uppercase

import java.util.*;
public class upperlowercount {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String input = keyboard.nextLine();
        
        int numOfUpCaseLetters =
            Long.valueOf(input.chars().filter(c -> Character.isUpperCase(c)).count())
            .intValue();
        int numOfLowCaseLetters =
            Long.valueOf(input.chars().filter(c -> Character.isLowerCase(c)).count())
            .intValue();
        System.out.println("The lenght of the string is " + input.length()
                               + ", the number of uppercase letter is " + numOfUpCaseLetters
                               + " & the number of lowercase letter is " + numOfLowCaseLetters + ".");
        
    }
}