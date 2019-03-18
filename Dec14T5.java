import java.util.Scanner;

public class Dec14T5{
    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter seconds: ");
        int sec=sc.nextInt();
        
        int hrs=sec/3600;
        int minC=sec%3600;
        int min=minC/60;
        int seconds=min%60;
        
        System.out.println(hrs + " hour/s " + min + " minute/s & " + seconds + " second/s");
    }
}
