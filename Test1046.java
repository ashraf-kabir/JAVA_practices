import java.util.*;

public class Test1046{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        int time=0;
        if((x>=0&&x<=23) && (y>=0&&y<23)){
            if(x>=y){
                time = (24-x)+y;
            }else if(x<y){
                time = (24-x)-(24-y);
            }
            System.out.println("O JOGO DUROU "+time+" HORA(S)");
        }
        else if(x==y){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}
