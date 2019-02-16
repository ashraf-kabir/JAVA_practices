import java.util.*;
import static java.lang.System.out;

public class Task09{
  static boolean flag=true;
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int []arr = new int[10];
    
    for(int a=0; a<arr.length; a++){
      out.println("Enter a number: ");
      arr[a] = sc.nextInt();
    }
    firstMainMethod(arr, arr.length);
  }
  public static void firstMainMethod(int []a, int length){
    for(int i=0; i<a.length; i++){
      out.print(a[i]+" ");
    }
    if(flag==true){
      secondMainMethod(a, a.length);
    }
  }
  public static void secondMainMethod(int []b, int length){
    for(int j=0; j<b.length; j++){
      b[j] = b[j]*b[j];
    }
    flag=false;
    firstMainMethod(b, b.length);
  }
}