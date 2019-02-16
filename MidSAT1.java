import java.util.Scanner;
public class MidSAT1 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter starting value:");
    int a=sc.nextInt();
    
    System.out.println("Enter ending value:");
    int b=sc.nextInt();
    
    System.out.println("Enter difference:");
    int d=sc.nextInt();
    
    for (int c=a; c<=b; c+=d) {
      System.out.print(c + " ");
    }
    System.out.println();
  }
}
