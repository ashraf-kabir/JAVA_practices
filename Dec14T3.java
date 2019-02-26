import java.util.Scanner;

public class Dec14T3{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the height of rectangle:");
        double height = sc.nextDouble();
        
        System.out.println("Enter the width of rectangle:");
        double width = sc.nextDouble();
        
        double area = height * width;
        
        System.out.println("The area of rectangle is: "+area);
    }
}
