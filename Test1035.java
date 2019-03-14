import java.util.Scanner;

public class Test1035{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int D=sc.nextInt();
        
        if(B>C && D>A){
            int X=C+D;
            int Y=A+B;
            if(X>Y){
                if(C>0 && D>0){
                    if(A%2==0){
                        System.out.println("Valores aceitos");
                    }
                }
            }
        }
        else{
            System.out.println("Valores nao aceitos");
        }
    }
}
