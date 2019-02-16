import java.util.Scanner;
public class Mode {
 public static void main(String [] args){
  Scanner sc = new Scanner (System.in);
  System.out.println("enter array length");
  int l= sc.nextInt();
  int n[] = new int[l];
  
  for(int i=0; i<n.length; i++){
   System.out.println("enter value");
   n[i]= sc.nextInt();
  }
  int temp = 0;
  for(int sort=0; sort<n.length-1; sort++){
   for(int compare=sort+1; compare<n.length; compare++){
    if(n[sort]>n[compare]){
     temp=n[sort];
     n[sort]= n[compare];
     n[compare]= temp;
    }
   }
  }
  double median=0;
  double sum=0;
  if(n.length%2==0){
   int z=n.length/2;
   int med= (n[z]+n[z-1]);
   median= med/2.0;
  } else {
   int z=n.length/2;
   median=n[z];
  }
  for(int print=0; print<n.length; print++){
   System.out.println(n[print]);
   sum+=n[print];
  }
  System.out.println(median);
  double mean = sum/n.length;
  double mode= 3*median- 2*mean;
  //System.out.println(mean);
  //System.out.println(sum);
  System.out.println("mode is "+mode);
 }

}
