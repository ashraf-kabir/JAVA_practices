import java.util.Scanner;
public class Q1Sec6SetAT2 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter days:");
    int days = sc.nextInt();
    
    int years = days/365;
    int remdaysay = days%365;
    int months = remdaysay/30;
    int remdaysam = remdaysay%30;
    
    
    System.out.println(years+" years "+months+" months " + remdaysam+ " days" );
  }
}