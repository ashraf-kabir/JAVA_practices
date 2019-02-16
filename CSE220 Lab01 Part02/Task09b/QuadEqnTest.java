import java.util.Scanner;
public class QuadEqnTest
{
  public static void main(String[] args)
  {
    double d;
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    QuadEqn q=new QuadEqn();
    q.setA(a);
    q.setB(b);
    q.setC(c);
    q.getA();
    q.getB();
    q.getC();
    q.Print();
    q.Root();
  }
}
