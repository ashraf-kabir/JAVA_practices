import java.util.Scanner;
public class Session2 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter an integer number:");
    int x = sc.nextInt();
    
    System.out.println("Enter a decimal number:");
    double y = sc.nextInt();
    
    double sum = x+y;
    System.out.println("You have inputted " + x + y);
    System.out.println("The total is " + sum);
    
  }
}