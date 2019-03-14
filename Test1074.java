import java.util.Scanner;

public class Test1074{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        
        for(int a=1; a<=num; a++){
            int d=sc.nextInt();
            if(d%2==0 && d>0){
                System.out.format("EVEN POSITIVE\n");
            }
            if(d%2==0 && d<0){
                System.out.format("EVEN NEGATIVE\n");
            }
            if(d%2!=0 && d>0){
                System.out.format("ODD POSITIVE\n");
            }
            if(d%2!=0 && d<0){
                System.out.format("ODD NEGATIVE\n");
            }
            if(d==0){
                System.out.format("NULL\n");
            }
        }
    }
}