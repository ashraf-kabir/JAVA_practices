import java.util.*;

public class ArrayTest001{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    int []n=new int[5];
    
    for(int a=0; a<n.length; a++){
      System.out.println("Enter a number: ");
      n[a]=sc.nextInt();
    }
    
    for(int b=n.length-1; b>=0; b--){            //reverse loop of array
      System.out.printf(n[b]+" ");
    }
    System.out.printf("\n");
  }
}
