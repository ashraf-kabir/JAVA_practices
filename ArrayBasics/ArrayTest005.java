import java.util.*;

public class ArrayTest005{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    int []n=new int[5];
    
    for(int a=0; a<n.length; a++){
      System.out.println("Enter a number: ");
      n[a]=sc.nextInt();
    }
    int temp=n[0];
    for(int b=1; b<n.length; b++){    //left rotate
      n[b-1]=n[b];
    }
    n[n.length-1]=temp;
    
    for(int d=0; d<n.length; d++){
      System.out.print(n[d]+" ");
    }
  }
}
