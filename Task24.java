import java.util.Scanner;

public class Task24{
  public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number");
    int n = sc.nextInt();
    
    for(int c=1; c<=n; c++){
      System.out.print(c);
      
    }
    System.out.println(" ");
  }
}