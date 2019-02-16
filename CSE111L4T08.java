import java.util.Scanner;

public class CSE111L4T08{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    int arr[]= new int[10];
    
    for(int i=0; i<arr.length; i++){
      int var=sc.nextInt();
      int v=0;
      
      for(int j=0; j<i; j++){
        if(arr[j]==var){
          System.out.println("Duplicate");
          v=1;
          break;
        }
      }
      if(v==0){
        arr[i]=var;
      }
      else{
        i--;
      }
    }
  }
}