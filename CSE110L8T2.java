import java.util.Scanner;

public class CSE110L8T2{
  public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    
    int num[]=new int [10];
    
    for(int a=0; a<num.length; a++){
      System.out.println("Enter number:");
      num[a]=sc.nextInt();
    }
    System.out.println("Enter index's number: ");
    int b=sc.nextInt();
    System.out.println(num[b]);
  }
}