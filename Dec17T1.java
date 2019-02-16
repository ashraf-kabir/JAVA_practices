import java.util.Scanner;

public class Dec17T1{
  public static void main (String args[]){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter first number: ");
    int x = sc.nextInt();
    
    System.out.println("Enter second number: ");
    int y = sc.nextInt();
    
    System.out.println("Enter third number: ");
    int z = sc.nextInt();
    
    int p = (x+y+z)/3;
    
    System.out.println("Average: "+p);
  }
}
