import java.util.Scanner;
public class EvenMin{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        boolean flag = true;
        double sum = 0;
        int c = 0, EC = 0,  min = 0;
        while (flag==true && c < 10){
            System.out.println("Enter Number");
            int n = sc.nextInt();
            if (n%2 == 0){
                min = n;
                sum = n;
                EC++;
                flag = false;
            }
            c++;
        }
        if (EC==0){
            System.out.println("no even number");
        }
        else{
            while (c < 10){            
                System.out.println("Enter Number");
                int num = sc.nextInt();
                if (num%2 == 0){
                    sum += num;
                    EC++;
                    if (num < min){
                        min = num;
                    }
                }
                c++;
            }
            double avg = sum / EC;
            System.out.println(avg);
            System.out.println(min);
        }
    }
}
