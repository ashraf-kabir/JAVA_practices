import java.util.Scanner;
public class Q1Sec7SetAT1{
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number:");
    int x = sc.nextInt();
    
    System.out.println("Enter number:");
    int y=sc.nextInt();
    
    if (x!=y) {
      int z = x*y;
      System.out.println(z);
    }
    
    else if (x==y) {
      int q=x*y;
      int p=q+q;
      System.out.println(p);
    }
  }
}
