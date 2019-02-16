import java.util.Scanner;

public class RectangleShape{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the row's length: ");
        int row=sc.nextInt();
        
        System.out.println("Enter the coloumn's length: ");
        int col=sc.nextInt();
        
        for(int rowC=1; rowC<=row; rowC++){
            for(int colC=1; colC<=col; colC++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}