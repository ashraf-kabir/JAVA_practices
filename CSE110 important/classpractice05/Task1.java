package classpractice05;

import java.util.Scanner;

public class Task1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int num[] = new int[5];
        int sum=0;
        
        for (int a=0; a<num.length; a++){
            System.out.println("Enter number:");
            num[a] = sc.nextInt();
        }
        
        for (int b=0; b<num.length; b++){
            sum+=num[b];
            System.out.println("You've entered "+num[b]);
        }
        System.out.println("Total is "+sum);
    }
    
}
