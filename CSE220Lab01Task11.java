import java.util.Scanner;
public class CSE220Lab01Task11{
  public static void main (String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please give a number: ");
    int num = sc.nextInt();
    
    System.out.println(allDigitsOdd(num));
  }
  
  public static boolean allDigitsOdd(int a){
    boolean test = true;
    for(int i=a; i>0; i/=10){
      int x = i%10;
      if(x%2==0){
        test = false;
        break;
      }
      else{
        test = true;
      }
    }
    return test;
  }
}
