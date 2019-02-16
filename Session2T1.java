import java.util.Scanner;
public class Session2T1 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double sum=0;
    System.out.println("Enter an integer number:");
    int x = sc.nextInt();
    
    System.out.println("Enter a decimal number:");
    double y = sc.nextDouble();
    
    sum=x+y;
    System.out.print("You have inputted " + x + " and " + y + ". ");
    System.out.println("The total is " + sum);
    
  }
}
