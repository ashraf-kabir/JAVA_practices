package classpractice05;

import java.util.Scanner;

public class Task4 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        
        int num[] = new int[5];
        int max=0;
        int maxLocation=0;
        
        for (int a=0; a<num.length; a++){
            System.out.println("Enter number:");
            num[a] = sc.nextInt();
        }
        
        for (int b=0; b<num.length; b++){
            if(num[b]>max){
                max=num[b];
                maxLocation=b;
            }
        }
        System.out.print("The largest number is " +max);
        System.out.println(" and the position of it's index is " +maxLocation);
    }
    
}
