import java.util.*;

public class ArrayTest003{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    int []n=new int[5];
    
    for(int a=0; a<n.length; a++){
      System.out.println("Enter a number: ");
      n[a]=sc.nextInt();
    }
    
    for(int i=n.length-1; i>0; i--){     //right shift 1
      n[i]=n[i-1];
    }
    n[0]=0;
    
    for(int i=0; i<n.length; i++){
      System.out.print(n[i]+" ");
    }
  }
}
