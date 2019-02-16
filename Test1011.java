import java.util.Scanner;

public class Test1011{
  public static void main(String args []){
    
    Scanner sc=new Scanner(System.in);
    
    double R=sc.nextDouble();
    
    double VOLUME= (4.0/3)*3.14159*(R*R*R);
    
    System.out.print("VOLUME = ");
    System.out.printf("%.3f", VOLUME);
    System.out.println();
  }
}
