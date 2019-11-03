import java.util.Scanner;

public class Task1154 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int sum=0;
        int c=0;
        for (int i=0; ; i++) {
            int x = sc.nextInt();
            if (x>0) {
                sum = sum + x;
                c++;
            } else {
                break;
            }
        }
        double p = c;
        double avg = 0.0;
        avg = sum/p;
        System.out.printf("%.2f\n", avg);
    }
}
