import java.util.Scanner;

public class Task25{
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number:");
    int n = sc.nextInt();
    
    int sum = 0;
    
    for (int c = 1; c<=n; c++){
      
      if (n%c == 0){
        sum++;
      }
      
    }
    
    System.out.println(sum);
  }
}