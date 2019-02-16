package annajiat;

import java.util.Scanner;

public class perfectRange {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        int rangeStart = sc.nextInt();
        
        System.out.println("Enter last number:");
        int rangeEnd = sc.nextInt();
        
        int temp=rangeStart;
        int sum=0;
        for (; temp<rangeEnd; temp++) {
            
            int count=0;
            for (int c=1; c<rangeStart; c++) {
                if (temp%c==0) {
                    sum+=count;
                }
            }
            if (sum==temp) {
                System.out.println(count);
            }
        }
        
    }
    
}
