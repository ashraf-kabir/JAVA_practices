import java.util.Scanner;
public class Q1Sec6SetAT1 {
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter year:");
    int x=sc.nextInt();
    
    if (x>0 && x<2016) {
      System.out.println("Past");
    }
    
    else if (x==2016) {
      System.out.println("Present");
    }
    
    else if (x>2016) {
      System.out.println("Future");
    }
    
    else {
      System.out.println("Wrong input");
    }
  }
}