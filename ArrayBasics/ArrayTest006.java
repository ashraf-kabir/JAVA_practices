import java.util.*;

public class ArrayTest006{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    int []n=new int[5];
    
    for(int a=0; a<n.length; a++){
      System.out.println("Enter a number: ");
      n[a]=sc.nextInt();
    }
    int temp=n[n.length-1];
    for(int b=n.length-1; b>0; b--){    //right rotate
      n[b]=n[b-1];
    }
    n[0]=temp;
    
    for(int d=0; d<n.length; d++){
      System.out.print(n[d]+" ");
    }
  }
}
