package classpractice04;

import java.util.Scanner;

public class Task4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        
        double x = sc.nextInt();
        double sum=0.0;
        
        for (double c=1; c<=x; c++){
            sum = sum+ (c/(2*c-1));
        }
        
        System.out.println(sum);
    }
    
}
