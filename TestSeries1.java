import java.util.Scanner;

public class TestSeries1{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter number: ");
    int num=sc.nextInt();
    
    int sum=0;
    
    for(int a=1; a<=num; a++){
      for(int b=1; b<=a; b++){
        sum+=Math.pow(b,2);
      }
    }
    System.out.println(sum);
  }
}