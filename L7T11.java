import java.util.Scanner;

public class L7T11 {
 public static void main(String[] args) {
  
  Scanner sc= new Scanner (System.in);
  
  System.out.println("Enter value:");
  int a = sc.nextInt();
  
  for(int rowCount=1; rowCount<=a; rowCount++){
   for(int space=1; space<=rowCount-a; space++){
    System.out.print(" ");
   }
   for(int number=a; number<=rowCount; number++){
    System.out.print(number);
   }
   System.out.println("");
  }
 }

}
