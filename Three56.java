import java.util.Scanner;
public class Three56 {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your birth year:");
        int birthYear = sc.nextInt();
        
        System.out.println("Enter your birth month:");
        int birthMonth = sc.nextInt();
        
        int countY=0;
        for (; birthYear<=2016; birthYear++) {
            countY++;
        }
        System.out.print(countY + " years");
        System.out.println();
    }
}
