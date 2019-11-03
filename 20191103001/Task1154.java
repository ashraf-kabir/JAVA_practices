import java.util.Scanner;
import java.util.Arrays;

public class Task1154 {
    public static void main(String[] args) {
        int x;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array :: ");
        int size = sc.nextInt();
        
        int myArray[] = new int[size];
        System.out.println("Enter elements of the array (Strings) :: ");
        
        int sum=0;
        for(int i=0; i<size; i++) {
            myArray[i] = sc.nextInt();
            sum+=myArray[i];
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println(sum);
    }
}