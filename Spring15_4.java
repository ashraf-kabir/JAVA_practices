import java.util.Scanner;
public class Spring15_4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= sc.nextInt();
        System.out.println("enter first number");
        int f= sc.nextInt();
        System.out.println("enter negative count");
        int nC= sc.nextInt();
        int sum=0;
        int m= f;
        
        for(int i=1; i<=n; i++){
            if(i%nC==0){
                sum-=f;
            }
            else {
                sum+=f;
            } 
            f+=m;
        }
        System.out.println(sum);
        
    }
    
}
