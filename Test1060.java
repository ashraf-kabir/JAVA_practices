import java.util.Scanner;

public class Test1060 {

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);
        
        int d=0;
        for(int c=1; c<=6; c++){
          double n=sc.nextDouble();
          if(n>0){
            d++;
          }
        }
        System.out.println(d+" valores positivos");
    }
}
