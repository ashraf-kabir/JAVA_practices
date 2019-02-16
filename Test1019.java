import java.util.Scanner;

public class Test1019{
  public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    
    int N=sc.nextInt();
    
    int hrs=N/3600;
    int remN=N%3600;
    int mins=remN/60;
    int seconds=remN%60;
    
    System.out.println(hrs+":"+mins+":"+seconds);
  }
}