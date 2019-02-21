import java.util.Scanner;

public class CP5T2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num[] = new int[10];

    for (int a = 0; a < num.length; a++) {
      System.out.println("Enter number:");
      num[a] = sc.nextInt();
    }

    for (int a = num.length - 1; a >= 0; a--) {
      System.out.println(num[a]);
    }
  }
}