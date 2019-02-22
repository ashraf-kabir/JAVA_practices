import java.util.Scanner;

public class CSE110L7T3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int row=sc.nextInt();
        int col=sc.nextInt();
        
        for(int rowC=1; rowC<=row; rowC++){
            for(int colC=1; colC<=col; colC++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
