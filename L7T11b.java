import java.util.Scanner;

public class L7T11b{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter value:");
    int n = sc.nextInt();
    
    int space;
    for(int rowCount=1; rowCount<=n; rowCount++){
      for(space=1; space<=n-rowCount; space++){
        System.out.print(" ");
      }
      for(int number=space; number<=n; number++){
        System.out.print(number);
      }
      System.out.println();
    }
  }
}
