import java.util.Scanner;

public class CSE110L8T10{
  public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    
    int num[]=new int[10];
    
    for(int a=0; a<num.length; a++){
      System.out.println("Enter number:");
      num[a]=sc.nextInt();
      for(int b=0; b<=a; b++){
        System.out.print(num[b] +" ");
      }
      System.out.println();
    }
  }
}