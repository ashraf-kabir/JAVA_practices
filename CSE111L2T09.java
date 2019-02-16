import java.util.*;
public class CSE111L2T09 {

 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);
  
  int bucky[]=new int[10];
  
  System.out.println("Enter ur number here ");
  
  for(int i=0;i<bucky.length;i++){
   int n=sc.nextInt();
   bucky[i]=n;
  }
  
  for(int i=0;i<bucky.length;i+=2){
   if(i==bucky.length-1){
   System.out.print(bucky[i]+".");
   }
   else{
    System.out.print(bucky[i]+",");
   }
  }
  
  for(int i=1;i<bucky.length;i+=2){
   if(i==bucky.length-1){
   System.out.print(bucky[i]+".");
   }
   else{
    System.out.print(bucky[i]+",");
   }
  }
 }
}