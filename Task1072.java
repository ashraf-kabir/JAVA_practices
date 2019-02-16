import java.io.IOException;
import java.util.Scanner;

public class Task1072 {
  public static void main(String[] args) throws IOException { 
    
    Scanner input =new Scanner(System.in);
    
    int a=0, b=0;
    
    int n =input.nextInt();
    
    for (int i=1; i<=n; i++) {
      int x =input.nextInt();
      if (x>=10 && x<=20) {
        a+=1;
      }
      else {
        b+=1;
      }
    }
    System.out.print(a+" in\n"+b +" out\n");
  }
}
