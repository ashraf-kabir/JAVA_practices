import java.util.Scanner;

public class Test1143{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        
        for(int b=1; b<=a; b++){
            int j=b*b;
            int k=b*b*b;
            System.out.format("%d %d %d\n",b,j,k);
        }
    }
}