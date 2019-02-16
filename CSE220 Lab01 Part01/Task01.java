import java.util.*;
import static java.lang.System.out;

public class Task01{
  public static void main(String []args){
    
    Scanner sc = new Scanner(System.in);
    
    out.println("Enter the array length: ");
    int r = sc.nextInt();
    
    int []n=new int[r];
    
    for(int a=0; a<n.length; a++){
      out.println("Enter number: ");
      n[a] = sc.nextInt();
    }
    if(n[0]==6 || n[r-1]==6){
      out.println("true");
    } else{
      out.println("false");
    }
  }
}
