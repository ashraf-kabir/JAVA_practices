import java.util.Scanner;

public class H4T215{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int c=0;
    for(; n>0; n=n/10){
      c++;
      System.out.print(c);
    }
  }
}
