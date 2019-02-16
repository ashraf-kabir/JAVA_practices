import java.util.Scanner;
public class Q3Sec8SetC {
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number:");
    int x= sc.nextInt();
    int sum=0;
    
    for (int c=1; c<=x; c++) {
      if (c%7==0) {
        sum+=c;
        
      }
      
    }
    System.out.println(sum);
  }
}
