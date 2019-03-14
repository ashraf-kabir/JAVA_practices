import java.util.Scanner;

public class Test1038{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int X=sc.nextInt();
        int Y=sc.nextInt();
        
        if(X==1){
            double p=Y*4.00;
            System.out.print("Total: R$ ");
            System.out.printf("%.2f", p);
            System.out.println();
        }
        else if(X==2){
            double q=Y*4.50;
            System.out.print("Total: R$ ");
            System.out.printf("%.2f", q);
            System.out.println();
        }
        else if(X==3){
            double r=Y*5.00;
            System.out.print("Total: R$ ");
            System.out.printf("%.2f", r);
            System.out.println();
        }
        else if(X==4){
            double s=Y*2.00;
            System.out.print("Total: R$ ");
            System.out.printf("%.2f", s);
            System.out.println();
        }
        else if(X==5){
            double t=Y*1.50;
            System.out.print("Total: R$ ");
            System.out.printf("%.2f", t);
            System.out.println();
        }
        else{
        }
    }
}
