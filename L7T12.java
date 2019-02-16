import java.util.Scanner;
public class L7T12 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    
    for (int i = 1; i<a; i += 2) {
      for (int j = 0; j<(a-1)-i/2; j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");

      System.out.print("\n");
    }

    for (int i = 7; i > 0; i -= 2) {
      for (int j = 0; j < (a-1)-i/2; j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");

      System.out.print("\n");
    }
  }
}