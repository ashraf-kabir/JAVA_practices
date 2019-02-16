import java.util.Scanner;

public class Hw4t10 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter row:");
  int a = sc.nextInt();
  
     int b =1;
     
     for(int rowCount=1; rowCount<=a; rowCount++){
       //while row is increasing space is decreasing
       for(int space=0; space<a-rowCount; space++){
       System.out.print(" ");
       }
       for(int number=1; number<=b; number++){
       System.out.print(number);
     }
             b+=2;
     System.out.println();
     }
 }

}
