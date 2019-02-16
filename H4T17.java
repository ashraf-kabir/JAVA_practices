import java.util.Scanner;

public class H4T17{
  public static void main(String[] args){
    int a=0;
    int b=1;
    int c=0;
    System.out.print(a);
    System.out.print(" " +b);
    c=a+b;
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(; c<=n; c=a+b){
      System.out.print(c + " ");
      a=b;
      b=c;
    }
    System.out.println();
  }
}
