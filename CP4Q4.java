import java.util.Scanner;

public class CP4Q4{
  public static void main(String[] args){
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number:");
    int n= sc.nextInt();
    
    int sum=0;
    
    for(int c=1; c<=n; c++){
      sum=sum+c/2*c-1;
    }
    System.out.println(sum);
  }
}