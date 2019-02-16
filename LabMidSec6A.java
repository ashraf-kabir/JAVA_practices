import java.util.Scanner;
public class LabMidSec6A {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int x=sc.nextInt();
    int pro=1;
    
    for (int c=x; c>0; c--) {
      pro=pro*c;
    }
    System.out.println(pro);
  }
}
