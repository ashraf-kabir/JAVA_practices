import java.util.*;

public class Test1020{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    int d=sc.nextInt();
    
    int year=d/365;
    int remd=d%365;
    int month=remd/30;
    int day=remd%30;
    
    System.out.println(year+" ano(s)");
    System.out.println(month+" mes(es)");
    System.out.println(day+" dia(s)");
  }
}