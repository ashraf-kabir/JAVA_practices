import java.util.Scanner;

public class Pyramid{
    public static void main(String args []){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter range: ");
        int a=sc.nextInt();
        
        int b=1;
        
        for(int rowC=1; rowC<=a; rowC++){
            for(int space=0; space<a-rowC; space++){
                System.out.print(" ");
            }
            for(int star=1; star<=b; star++){
                System.out.print("*");
            }
            b+=2;
            System.out.println();
        }
    }
}
