import java.util.Scanner;
public class LabMidSec6AT2 {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number:");
    int r=sc.nextInt();
    
    System.out.println("Enter number:");
    int n=sc.nextInt();
    double sum=0;
    
    for (int c=1; c<=n; c++) {
      double d = Math.pow(c,r);
      sum+=d;
    }
    System.out.println(sum);
  }
}
