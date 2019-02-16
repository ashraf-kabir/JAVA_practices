import java.util.Scanner;
public class eleven16 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter range:");
   int r = sc.nextInt();
   
   int sum=0;
   double avg=0;
   for (int a=1; a<=r; a++) {
     System.out.println("Enter number:");
     int n = sc.nextInt();
     
     if (n>=0 && n<=100) {
       sum+=n;
     }
     System.out.println(sum);
   }
   avg=sum/r;
   System.out.println(avg);
  }
}
