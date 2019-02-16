import java.util.Scanner;
public class LabMidSec6BT1 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number:");
    int a=sc.nextInt();
    
    System.out.println("Enter number:");
    int b=sc.nextInt();
    
    double d = Math.pow(a,b);
    
    System.out.println(d);
  }
}
