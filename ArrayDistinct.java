import java.util.Scanner;
import java.io.*;

public class ArrayDistinct {
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        
        // Create arrays & variables  
        int arrayLength = 10;
        int[] numbers = new int[arrayLength];
        int[] distinctArray = new int[arrayLength];
        int count = 0;
        
        System.out.println("Program starting...");
        System.out.print("Please enter in " + numbers.length + " numbers: ");
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        
        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[i];
            int tempTwo = numbers[i + 1];
            
            if (tempTwo == temp) {
                count++;
                distinctArray[i] = temp;
            }
        } 
        
        // Print out results
        
    } // end main
} // end class