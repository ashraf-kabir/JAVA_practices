import java.util.Scanner;

public class HW4T8{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number");
    int n = sc.nextInt();
    
    int c;
    
    for (c=1; c<=n; c++){
      n/=10;
      System.out.print(c);
    }
    System.out.println();
  }
}
