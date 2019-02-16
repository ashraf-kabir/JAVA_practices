import java.util.*;
import static java.lang.System.out;

public class Task01{
  public static void main(String []args){
    
    Scanner sc = new Scanner(System.in);
    
    int []arr = new int[5];
    
    for(int a=0; a<arr.length; a++){
      out.println("Enter number:");
      arr[a] = sc.nextInt();
    }
  }
}
