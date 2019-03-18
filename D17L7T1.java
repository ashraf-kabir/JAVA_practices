import java.util.Scanner;

public class D17L7T1{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter range in number: ");
        int r=sc.nextInt();
        
        for(int c=1; c<=r; c++){
            System.out.print(c);
        }
        System.out.println();
    }
}
