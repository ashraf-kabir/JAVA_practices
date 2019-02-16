import java.util.*;
import static java.lang.System.out;

public class Task06{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int []arr = new int[5];
    
    boolean flag = false;
    for(int a=0; a<arr.length; a++){
      out.println("Enter number: ");
      arr[a] = sc.nextInt();
    }
    for(int i=0; i<arr.length; i++){
      if(arr[i]==arr[arr.length-1-i]){
        flag=true;
      } else{
        flag=false;
        break;
      }
    }
    if(flag==true){
      out.println("Palindrome");
    } else{
      out.println("Not Palindrome");
    }
  }
}
