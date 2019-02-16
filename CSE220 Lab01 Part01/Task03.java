import java.util.*;
import static java.lang.System.out;

public class Task03{
  public static void main(String []args){
    
    Scanner sc = new Scanner(System.in);
    
    int []n = new int[5];
    int temp;
    for(int a=0; a<n.length; a++){
      out.println("Enter number: ");
      n[a] = sc.nextInt();
    }
    
    for(int a=0; a<n.length; a++){
      for(int b=0; b<n.length; b++){
        if(n[a]<n[b]){
          temp=n[a];
          n[a]=n[b];
          n[b]=temp;
        }
      }
    }
    for(int d=0; d<n.length; d++){
    out.printf(n[d]+", ");
    }
    for(int k=0; k<n.length; k++){
      if(n[k]%2==0){
        out.print(n[k]);
      }
//      if(k==n.length-3){
//        System.out.print(" ,");
//      } else if(k==n.length-2){
//        System.out.print(" ,");
//      } else if(k%2==0 && k==n.length-1){
//        System.out.print(".");
//      }
    }
  }
}
