import java.util.Scanner;

public class Task18b{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        int n = sc.nextInt();
        for(int c=0;c<=n ;c++){
            if (n!=0){
                n/=10;
            }
            System.out.println(n);
        }
        
        
    }
    
}
