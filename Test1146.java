import java.util.*;

public class Test1146{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=1; ;i++){
            int n = sc.nextInt();
            
            if(n==0){
                break;
            }
            System.out.print("1");
            for(int j=2; j<=n; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
