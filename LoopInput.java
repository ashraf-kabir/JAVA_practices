import java.util.Scanner;

public class LoopInput{
  public static void main(String args[]){
    
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter range: ");
    int r=sc.nextInt();
    
    int sum=0;
    for(int c=1; c<=r; c++){
      System.out.println("Enter a number: ");
      int n=sc.nextInt();
      sum=sum+n;
    }
    System.out.println(sum);
  }
}
