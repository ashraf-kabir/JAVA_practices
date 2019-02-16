import java.util.Scanner;

public class CSE111L9T7 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  Scanner sc = new Scanner(System.in);
  
  int[] num= new int [10];
  
  for (int a=0; a<num.length; a++){
   System.out.println("Enter number:");
   num[a]= sc.nextInt();
  }
  
  for (int even=0; even<num.length; even++){
   if (num[even] %2==0){
    System.out.println(num[even]);
   }
  }
  
  for (int odd=0; odd<num.length; odd++){
   if (num[odd] %2!=0){
    System.out.println(num[odd]);
   }
  }
 }

}
