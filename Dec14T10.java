import java.util.Scanner;

public class Dec14T10{
  public static void main(String args[]){
    
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter your favorite car's name: ");
    String x = sc.nextLine();
    
    for(int i=1; i<=4; i++){
      System.out.println(x);
    }
  }
}
