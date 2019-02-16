import java.util.*;
import static java.lang.System.out;

public class Task07{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int []arr = new int[10];
    
    boolean flag = false;
    for(int a=0; a<arr.length; a++){
      out.println("Enter number: ");
      arr[a] = sc.nextInt();
    }
    out.println("Enter a number between 0 to 9: ");
    int num = sc.nextInt();
    
    for(int i=0; i<arr[num]; i++){
      out.print("*");
    }
    out.println();
  }
}
