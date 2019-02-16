import java.util.Scanner;

public class L5T4{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    for (int c=1; c<=20;c++){
      System.out.println("Enter number:");
      int n = sc.nextInt();
      
      if (n%2==0){
        System.out.println("Even");
      }
      else if (n%2!=0){
        System.out.println("Odd");
      }
    }
  }
}
