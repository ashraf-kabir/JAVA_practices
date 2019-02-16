import java.util.Scanner;

public class Task7 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter value");
  int n = sc.nextInt();
  
  for (int rowCount = 1; rowCount <= n; rowCount++){
   for (int space = 1; space <=n-rowCount; space++){
     System.out.print(" ");
   }
   for (int star = 1; star<=rowCount; star++ ){
    System.out.print("*");
   }
   System.out.println(" ");
  }
  
  
  
 }
 

}
