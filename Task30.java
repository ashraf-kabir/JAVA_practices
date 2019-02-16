import java.util.Scanner;

public class Task30{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter first number:");
    int n= sc.nextInt();
    
    System.out.println("Enter second number:");
    int m= sc.nextInt();
    
    int primeCounter=0;
    int perfectCounter=0;
    
    for (; n<=m; n++){
      int sum=0;
      int factorCounter=0;
      
      for(int divisor=1; divisor<n; divisor++){
        if(n%divisor==0){
          factorCounter++;
          sum+=divisor;
        }
        }
      if (factorCounter==1){
        primeCounter++;
        }
      if (sum==n){
        perfectCounter++;
        }
    }
    System.out.println(primeCounter+ " Prime number");
    System.out.println(perfectCounter+ " Perfect number");
  }
}
