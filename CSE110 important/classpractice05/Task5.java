package classpractice05;

import java.util.Scanner;

public class Task5 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        
        int num[] = new int[5];
        int sum=0;
        
        for(int a=0; a<num.length; a++){
            System.out.println("Enter number:");
            num[a] = sc.nextInt();
        }
        
        for (int a=0; a<num.length; a++){
            sum+=num[a];
        }
        
        double avg=sum/num.length;
        int count=0;
        
        for (int b=0; b<num.length; b++){
            if (num[b]>avg){
                count++;
                System.out.println(num[b]);
            }
        }
        System.out.println(count);
    }
    
}
