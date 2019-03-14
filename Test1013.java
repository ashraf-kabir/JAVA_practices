import java.util.Scanner;

public class Test1013{
    
    public static void main(String argsg[]){
        
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        int maiorab = ((a+b + Math.abs(a-b))/2);
        int maiorabc = ((maiorab+c+ Math.abs(maiorab-c))/2);
        
        System.out.println(maiorabc+" eh o maior");
    }
}
