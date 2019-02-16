import java.util.Scanner;

public class HW4T18{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number");
    int n = sc.nextInt();
    
    int c=1;
    
    for (; n>0; n=n/10){
      c++;
      System.out.print(n);
    }
    System.out.println();
  }
}
