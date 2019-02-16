import java.util.Scanner;
public class Test{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter 1st coefficient: ");
    int a=sc.nextInt();
    
    System.out.println("Enter 2nd coefficient: ");
    int b=sc.nextInt();
    
    System.out.println("Enter 3rd coefficient: ");
    int c=sc.nextInt();
    
    System.out.println("Quadratic equation: "+a+"x2"+b+"x+"+c);
    QuadEqn q=new QuadEqn();
    
    System.out.println("Root is "+q.root(a,b,c));
  }
}
