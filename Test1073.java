import java.util.Scanner;

public class Test1073{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    int num=sc.nextInt();
    
    for(int a=1; a<=num; a++){
      if(a%2==0){
        System.out.format("%d^2 = %d\n", a,(a * a));
      }
    }
  }
}
