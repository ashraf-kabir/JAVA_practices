import java.util.Scanner;
public class sizerTask1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter range:");
        int r = sc.nextInt();
        
        int num[] = new int[r];
        
        for (int a=0; a<num.length; a++) {
            System.out.println("Enter number:");
            num[a] = sc.nextInt();
        }
        int temp=0;
        double median=0;
        
        for (int a=0; a<num.length; a++) {
            for (int b=a+1; b<num.length; b++) {
                if (num[a]>num[b]) {
                    temp=num[a];
                    num[a]=num[b];
                    num[b]=temp;
                }
            }
        }
        int count=0;
        for (int e=0; e<num.length; e++) {
            if (num[a]%2==0) {
                count++;
            }
        }
        
    }
}