import java.util.Scanner;

public class Test1064{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        double num[]=new double[6];
        
        int c=0;
        double sum=0;
        double avg=0;
        for(int a=0; a<num.length; a++){
            num[a]=sc.nextDouble();
            if(num[a]>0){
                c++;
                sum+=num[a];
            }
        }
        
        avg=(sum/c);
        System.out.println(c+" valores positivos");
        System.out.printf("%.1f", avg);
        System.out.println();
    }
}
