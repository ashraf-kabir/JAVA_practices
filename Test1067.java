import java.util.Scanner;

public class Test1067{
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        
        int X = input.nextInt();
        System.out.print(1+"\n");
        
        for(int a=1; a<X-1; a+=2){
            int odd = a+2;
            System.out.print(odd+"\n");
        }
    }
}
