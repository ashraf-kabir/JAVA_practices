import java.util.*;

public class ArrayTest004{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    int []n=new int[5];
    
    for(int a=0; a<n.length; a++){
      System.out.println("Enter a number: ");
      n[a]=sc.nextInt();
    }
    
    for(int i=1; i<n.length; i++){     //left shift 1
      n[i-1]=n[i];
    }
    n[n.length-1]=0;
    
    for(int j=0; j<n.length; j++){
      System.out.print(n[j]+" ");
    }
  }
}
