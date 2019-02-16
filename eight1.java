import java.util.Scanner;
public class eight1 {
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter ID number:");
    int r = sc.nextInt();
    
    for (int c=200; c<=r; c++) {
      System.out.print(c + " ");
    }
    System.out.println();
  }
}
