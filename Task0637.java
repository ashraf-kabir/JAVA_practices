import java.util.Scanner;
public class Task0637 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number:");
    int x = sc.nextInt();
    int a;
    int b;
    int c;
    
    if (x>=1 && x<=3) {
      System.out.println(x + " BT");
    }
    else if (x>=4 && x<=7) {
      a=x-3;
      System.out.println(a + " MT");
    }
    else if (x>=8 && x<=10) {
      b=x-6;
      System.out.println(b + " PT");
    }
    else if (x>=11 && x<=12) {
      c=x-6;
      System.out.println(c + " PT");
    }
  }
}
