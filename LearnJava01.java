import java.util.Scanner;
public class LearnJava01 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your name:");
    String x = sc.nextLine();
    
    System.out.println("Good afternoon, " + x);
  }
}
