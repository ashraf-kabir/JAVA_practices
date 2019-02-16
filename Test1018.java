import java.util.*;

public class Test1018{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    
    int a=n/100;
    int b=n%100;
    int c=b/50;
    int d=b%50;
    int e=d/20;
    int f=d%20;
    int g=f/10;
    int h=f%10;
    int i=h/5;
    int j=h%5;
    int k=j/2;
    int l=j%2;
    
    System.out.println(n);
    System.out.println(a+" nota(s) de R$ 100,00");
    System.out.println(c+" nota(s) de R$ 50,00");
    System.out.println(e+" nota(s) de R$ 20,00");
    System.out.println(g+" nota(s) de R$ 10,00");
    System.out.println(i+" nota(s) de R$ 5,00");
    System.out.println(k+" nota(s) de R$ 2,00");
    System.out.println(l+" nota(s) de R$ 1,00");
  }
}