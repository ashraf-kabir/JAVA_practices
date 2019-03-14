import java.util.Scanner;

public class Test1005{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        double A =sc.nextDouble();
        double B =sc.nextDouble();
        
        if (A<=10.0 && B<=10.0){
            double MEDIA=(A*3.5)+(B*7.5);
            MEDIA =MEDIA/2;
            
            
            System.out.print("MEDIA = ");
            System.out.printf("%.5f", MEDIA);
            System.out.println();
        }
        
        else{
        }
    }
}
