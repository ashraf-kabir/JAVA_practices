import java.util.Scanner;
public class LabMidSec8A {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number:");
    int w= sc.nextInt();
    
    System.out.println("Enter number:");
    int b= sc.nextInt();
    
    for (int c=w; c<=b; c++) {
      System.out.print(c + " ");
    }
    System.out.println();
  }
}
