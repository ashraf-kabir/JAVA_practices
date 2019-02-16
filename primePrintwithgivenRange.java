import java.util.Scanner;
public class primePrintwithgivenRange {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter range:");
    int r=sc.nextInt();
    
    for (int c=1; c<=r; c++) {
      int div=0;
      for (int i=1; i<=c; i++) {
        if (c%i==0) {
          div++;
        }
      }
      if (div==2) {
        System.out.print(c + " ");
      }
    }
  }
}
