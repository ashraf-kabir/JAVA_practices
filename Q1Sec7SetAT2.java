import java.util.Scanner;
public class Q1Sec7SetAT2 {
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter number:");
    double x=sc.nextInt();
    
    if (x<2.0) {
      System.out.println("Fail");
    }
    else if (x>=2.0) {
      System.out.println("Pass");
    }
    else if (x>=3.5 && x<=3.64) {
      System.out.println("Distinction");
    }
    else if (x>=3.65 && x<=3.79) {
      System.out.println("High Distinction");
    }
    else if (x>=3.8 && x<=4.00) {
      System.out.println("Highest Distinction");
    }
    
    else {
      System.out.println("Invalid");
    }
  }
}