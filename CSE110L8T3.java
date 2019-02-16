import java.util.Scanner;

public class CSE110L8T3{
  public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    int num[]=new int[10];
    
    for(int a=0; a<num.length; a++){
      System.out.println("Enter number: ");
      num[a]=sc.nextInt();
    }
    for(int b=num.length-1; b>=0; b--){
      System.out.println(num[b]);
    }
  }
}