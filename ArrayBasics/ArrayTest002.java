import java.util.*;

public class ArrayTest002{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    int []n=new int[5];
    
    for(int a=0; a<n.length; a++){
      System.out.println("Enter a number: ");
      n[a]=sc.nextInt();
    }
    int []b=new int[n.length];
    for(int i=0; i<n.length; i++){
      b[i]=n[i];         //array copy from one to another
    }
    for(int i=0; i<n.length; i++){
      System.out.print(b[i]+" ");
    }
  }
}
