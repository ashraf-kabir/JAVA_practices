import java.util.Scanner;
public class Q5Sec7SetAT1 {
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter range:");
    int r = sc.nextInt();
    
    int num[]= new int[r];
    int temp=0;
    double median=0;
    double sum=0;
    double mean=0;
    double mode=0;
    
    for (int a=0; a<num.length; a++) {
      System.out.println("Enter number:");
      num[a]=sc.nextInt();
      sum+=num[a];
    }
    mean=sum/num.length;
    //System.out.println(mean);
    
    for (int a=0; a<num.length; a++) {
      for (int b=a+1; b<num.length; b++) {
        if (num[a]>num[b]) {
          temp=num[a];
          num[a]=num[b];
          num[b]=temp;
        }
      }
    }
    if (num.length%2!=0) {
      int h = num.length/2;
      median=num[h];
    }
    else if (num.length%2==0) {
      int d=num.length/2;
      median = (num[d] + num[d-1])/2.0;
    }
    mode = 3*median-2*mean;
    System.out.println(mode);
  }
}
