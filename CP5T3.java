import java.util.Scanner;

public class CP5T3{
  public static void main(String [] args){
    
    Scanner sc= new Scanner(System.in);
    
    int num[]= new int[10];
    
    for (int a=0; a<num.length; a++){
      System.out.println("Enter number:");
      num[a]= sc.nextInt();
    }
    
    for (int b=0; b<num.length; b++){
      if (num[b] % 2==0){
        System.out.println("The first even number is " +num[b]);
        break;
      }
    }
  }
}