import java.util.Scanner;

public class Test1012{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        double A=sc.nextDouble();
        double B=sc.nextDouble();
        double C=sc.nextDouble();
        
        double TRIANGULO=(1.0/2)*A*C;
        double CIRCULO=3.14159*C*C;
        double TRAPEZIO=(1/2.0)*(A+B)*C;
        double QUADRADO=B*B;
        double RETANGULO=A*B;
        
        System.out.print("TRIANGULO: ");
        System.out.printf("%.3f", TRIANGULO);
        System.out.println();
        System.out.print("CIRCULO: ");
        System.out.printf("%.3f", CIRCULO);
        System.out.println();
        System.out.print("TRAPEZIO: ");
        System.out.printf("%.3f", TRAPEZIO);
        System.out.println();
        System.out.print("QUADRADO: ");
        System.out.printf("%.3f", QUADRADO);
        System.out.println();
        System.out.print("RETANGULO: ");
        System.out.printf("%.3f", RETANGULO);
        System.out.println();
    }
}
