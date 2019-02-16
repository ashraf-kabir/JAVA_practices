import java.util.*;
import static java.lang.System.out;

public class Task05{
  public static void main (String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int []count = new int[10];
    
    for(int a=1; a<=15; a++){
      out.println("Enter a number between 0 to 9: ");
      int n = sc.nextInt();
      if (n<=9){
        count[n]++;
      } else{
        out.print("You've entered wrong number. ");
        a--;
      }
    }
    for(int d=0; d<10; d++){
      out.println(d+" was found "+count[d]+" times");
    }
  }
}
