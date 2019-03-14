import java.util.Scanner;

public class Test00002{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        double R=sc.nextDouble();
        
        double A= 3.14159*(R*R);
        
        System.out.print("A=");
        System.out.printf("%.4f", A);
        
        System.out.println();
    }
}