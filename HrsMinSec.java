import java.util.Scanner;

public class HrsMinSec{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter unit in second: ");
        int sec=sc.nextInt();
        
        int hrs = sec/3600;
        int remSec = sec%3600;
        int min = remSec/60;
        int remMin = remSec%60;
        int seconds = remMin%60;
        
        System.out.println(hrs);
        System.out.println(min);
        System.out.println(seconds);
        //System.out.println(hrs);
    }
}