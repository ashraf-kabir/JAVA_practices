import java.util.Scanner;

public class Task3 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter number:");
  int a = sc.nextInt();
  
  int max = a;
  int sum = a;
  
  for(int c = 1; c<=19; c++){
   
   System.out.println("Enter number:");
   int b = sc.nextInt();
   
   if (b>max){
    max=b;
   }
   sum+=b;
  }
  double avg=sum/10.0;
  System.out.println("Average value is = "+avg);
  System.out.println("Maximum value is = "+max);
  
 }

}
