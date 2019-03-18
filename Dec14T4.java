import java.util.Scanner;

public class Dec14T4{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your payment:");
        int p=sc.nextInt();
        
        System.out.println("Enter your age:");
        int a=sc.nextInt();
        
        if (p<10000 || a<18){
            System.out.println("No tax");
        }
        
        else if (p>=10000 && p<=20000){
            int tax = (p*5)/100;
            System.out.println("Your tax is: "+ tax);
        }
        
        else if (p>20000) {
            int tax = (p*10)/100;
            System.out.println("Your tax is: "+ tax);
        }
    }
}
