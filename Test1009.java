import java.util.Scanner;

public class Test1009{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String x=sc.nextLine();
        double m=sc.nextDouble();
        double n=sc.nextDouble();
        
        double p=(n*0.15)+m;
        
        System.out.print("TOTAL = R$ ");
        System.out.printf("%.2f", p);
        System.out.println();
        
    }
}