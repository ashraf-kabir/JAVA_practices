import java.util.Scanner;

public class Dec22L8T1{
  public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    
    int num[]=new int[3];
    
    int sum=0;
    
    for(int a=0; a<num.length; a++){
      System.out.println("Enter number:");
      num[a]=sc.nextInt();
      sum+=num[a];
    }
    System.out.println("Total: "+sum);
    
    for(int b=0; b<num.length; b++){
      System.out.println(num[b]);
    }
  }
}
