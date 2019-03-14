import java.util.Scanner;

public class Test1015{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        double x1 =sc.nextDouble();
        double y1 =sc.nextDouble();
        double x2 =sc.nextDouble();
        double y2 =sc.nextDouble();
        
        double p=(x2-x1);
        double r=p*p;
        double q=(y2-y1);
        double s=q*q;
        
        double z=r+s;
        
        System.out.printf("%.4f",Math.sqrt(z));
        System.out.println();
    }
}