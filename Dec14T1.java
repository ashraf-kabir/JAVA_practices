import java.util.Scanner;

public class Dec14T1 {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the marks:");
        int x=sc.nextInt();
        
        if (x<50){
            System.out.println("You shall not pass");
        }
        else {
            System.out.println("Pass");
        }
    }
}