import java.util.*;

public class Test1049{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for (int i=0; ;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            
            if (x>0 && y>0){
                int p=x;
                int q=y;
                
                for (int k=1; k==p; q++){
                    sum+=q;
                }
            } else{
                break;
            }
        }
        System.out.println(sum);
        
    }
}