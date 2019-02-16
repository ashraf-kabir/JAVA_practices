import java.util.Scanner;
public class Q3Sec8SetDT1 {
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    int pass=0;
    int fail=0;
    for (int a=1; a<=10; a++) {
      System.out.println("Enter number:");
      int x=sc.nextInt();
      
    if (x>=50 && x<=100) {
        pass++;  
    }
    
    
    if (x>=0 && x<=49){
      fail++;
    }
    
    }
    System.out.println("total passed" +pass);
    System.out.println("Total failed" +fail);
  }
}
