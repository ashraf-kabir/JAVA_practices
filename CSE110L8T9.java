import java.util.Scanner;

public class CSE110L8T9{
  public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    
    int num[]=new int[10];
    
    for(int a=0; a<num.length; a++){
      System.out.println("Enter number:");
      num[a]=sc.nextInt();
    }
    
    System.out.println("Enter a number to check whether it is stored or not.");
    int m=sc.nextInt();
    
    for(int b=0; b<num.length; b++){
      if(m==num[b]){
        System.out.println("This number is previously stored.");
      }
      
      else{
        if(b==num.length-1){
          System.out.println("Sorry, this number isn't stored.");
        }
      }
    }
  }
}