import java.util.Scanner;
public class Task8516a {
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter range:");
    int r = sc.nextInt();
    
    int sum=0;
    int median=0;
    int num[] = new int[r];
    
    for (int a=0; a<num.length; a++) {
      System.out.println("Enter number:");
      num[a] = sc.nextInt();
    }
    for (int e=0; e<num.length; e++) {
      if (num[e] %2!=0){
      median = r/2;
      System.out.println(num[median]);
    }
    
    else {
      
        int d=r/2;
        median = num[d] + num[d-1];
        double med= median/2.0;
        
        System.out.println(med);
        //System.out.println(num[b]);
      }
    } 
  }
}
