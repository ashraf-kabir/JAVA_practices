import java.util.Scanner;
public class LabMidSec6BTask2 {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number:");
    int r=sc.nextInt();
    
    System.out.println("Enter number:");
    int n=sc.nextInt();
    double sum=0;
    
    for (int c=n; c>=0; c--) {
      double d = Math.pow(r,c);
      sum+=d;
    }
    System.out.println(sum);
  }
}
