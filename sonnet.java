import java.util.Scanner;
public class sonnet {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number:");
        int n = sc.nextInt();
        
        double sum=0;
        double num=0;
        
        for (int i=1; i<=n; i++) {
            num=1.0/i;
            if (i%4==0) {
                num*=(-1);
            }
            sum+=num;
        }
        System.out.println(sum);
    }
}
