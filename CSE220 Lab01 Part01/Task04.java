import java.util.*;
import static java.lang.System.out;

public class Task04{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    int n[]=new int[10];
    for(int a=0; a<n.length; a++){
      out.println("Enter number: ");
      int num=sc.nextInt();
      int c=0;
      for(int b=0; b<a; b++){
        if(n[b]==num){
          out.println("Duplicate found!");
          c++;
          break;
        }
      }
      if(c==0){
        n[a]=num;
      } else{
        a--;
      }
    }
  }
}
