import java.util.Scanner;
public class Taskmornin{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of total students:");
        int r=sc.nextInt();
        
        int failC=0;
        int passC=0;
        
        for(int c=1; c<=r; c++) {
            System.out.println("Enter marks:");
            int n = sc.nextInt();
            
            if (n>=0 && n<=49) {
                failC++;
            }
            
            if (n>=50 && n<=100) {
                passC++;            
            }
        }
        System.out.println("Total fail: " + failC);
        System.out.println("Total pass: " + passC);
    }
}
