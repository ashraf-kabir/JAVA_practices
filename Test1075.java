import java.util.Scanner;

public class Test1075{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    int a=sc.nextInt();
    
    for(int c=1; c<1000; c++){
      if(c%a==0){
        System.out.println(c);
      }
    }
    
  }
}