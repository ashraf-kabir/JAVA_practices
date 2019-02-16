import java.util.Scanner;

public class Task16{
  public static void main(String [] args){
  
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number:");
    int n = sc.nextInt();
    
    int max = n;
    int min = n;
    int sum = n;
    
    for (int c = 1; c<=9; c++){
      
      System.out.println("Enter number:");
      int x = sc.nextInt();
      
      if(x>max){
        max=x;
      }
      else if (x<min){
        min=x;
      }
      sum+=x;
    }
    double avg=sum/10.0;
    System.out.println(avg);
    System.out.println(max);
    System.out.println(min);
  }
}
