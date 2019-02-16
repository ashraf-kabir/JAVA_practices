import java.util.Scanner;
public class Q1Sec7SetBT1 {
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter number:");
    int x=sc.nextInt();
    
    System.out.println("Enter number:");
    int y=sc.nextInt();
    
    int sum=x+y;
    if (x==10 || y==10) {
      System.out.println("Happy10");
    }
    else if (sum==10) {
      System.out.println("Happy10");
    }
    else {
      System.out.println("Sad10");
    }
  }
}