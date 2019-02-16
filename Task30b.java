import java.util.Scanner;
public class Task30b {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter first number");
  int n = sc.nextInt();
  System.out.println("enter second number");
  int m = sc.nextInt();
  
  int primeCount=0;
  int perfectCount=0;
  for(; n<=m; n++){
   int sum =0;
   int count = 0;
   for(int j=1; j<n; j++){
    if(n%j==0){
     count ++;
     sum+=j;
    }
   }
   if(count==1){
    primeCount ++;
    //System.out.println("prime");
   }
   if(sum==n){
    perfectCount ++;
    //System.out.println("perfect");
   }
  }
  System.out.println(primeCount +" prime number");
  System.out.println(perfectCount+ " perfect number");
 }

}
