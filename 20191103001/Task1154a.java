import java.util.Scanner;

public class Task1154a {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        while ((x =sc.nextInt()) > 0) {
            int sum = 0;
            int c=1;
            for (int i=x; c<= 5; i++) {
                if (i % 2 == 0) {
                    sum += i;
                    c += 1;
                }
            }
            
        }
        System.out.print(sum+"\n");
    }
}
