import java.util.Scanner;

public class Test{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter range: ");
        int a=sc.nextInt();
        
        for(int rC=1; rC<=a; rC++){
            for(int space=1; space<=a-rC; space++){
                System.out.print(" ");
            }
            for(int star=1; star<=rC; star++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
