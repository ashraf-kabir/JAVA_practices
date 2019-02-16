import java.util.Scanner;

public class Test1008{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    int a=sc.nextInt();
    int b=sc.nextInt();
    double c=sc.nextDouble();
    
    double x=b*c;
    
    System.out.println("NUMBER = "+a);
    System.out.print("SALARY = U$ ");
    System.out.printf("%.2f", x);
    System.out.println();
  }
}
