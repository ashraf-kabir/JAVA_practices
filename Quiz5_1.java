import java.util.Scanner;
public class Quiz5_1 {
  public static void main ( String [] args ) {
    Scanner sc = new Scanner ( System.in);
   
    int median=0;
    int N=sc.nextInt();
    int arr [] = new int [N];
    
    for ( int i=0; i<arr.length; i++) {
      System.out.println("Enter a number");
      arr[i]=sc.nextInt();
    }
    int temp=0; 
    for( int j=0; j<arr.length-1;j++) {
      for( int k=0; k<arr.length-j; k++) {
        if(arr[k]==arr[k+1]) {
          temp=arr[k];
          arr[k]=arr[k+1];
          arr[k+1]=temp;
        }
      }
    }
    if(arr.length%2==0) {
      int m=arr.length/2;
      median=(arr[m-1]+arr[m])/2;
    } else {
       median=arr[arr.length/2];
    }
    System.out.println(median);
  }
}