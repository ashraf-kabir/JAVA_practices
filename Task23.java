import java.util.Scanner;

public class Task23 {
 public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("enter number");
  int n = sc.nextInt();
  int digit = 0;
  for(int temp= n;temp>0;temp/=10){
   digit ++;
  }  
  //System.out.println(digit);
  double pro = Math.pow(10, digit-1);
  //System.out.println(pro);
  for(; pro>0;pro/=10){
   int m = n/(int)pro;
   n%=(int)pro;
   if(n==0){
    System.out.println("zero");
   }
   else if(m==1){
    System.out.println("one");
   }
   else if(m==2){
    System.out.println("two");
   }
   else if(m==3){
    System.out.println("three");
   }
   else if(m==4){
    System.out.println("four");
   }
   else if(m==5){
    System.out.println("five");
   }
   else if(m==6){
    System.out.println("six");
   }
   else if(m==7){
    System.out.println("seven");
   }
   else if(m==8){
    System.out.println("eight");
   }
   else if(m==9){
    System.out.println("nine");
   }
  }
 } 

}
