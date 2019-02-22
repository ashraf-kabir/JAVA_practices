import java.util.Scanner;

public class Test1080{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int max=0,Loc=0;
        for(int c=1; c<=100; c++){
            int a=sc.nextInt();  
            if(max<a){
                max=a;
                Loc=c;  
            }
        }
        System.out.format("%d\n%d\n",max,Loc);
    }
}
