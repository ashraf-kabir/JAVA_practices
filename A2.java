import java.util.Scanner;

public class A2 {
  public static void main(String[] args){
    
    Scanner sc= new Scanner(System.in);
    
    
    int num[] ={10,30,20,50,40};
    
    for (int i = 0; i<num.length; i++){
      num[i] = sc.nextInt();
    }
    int sum=0;
    for (int i = 1; i <num.length; i++){
      sum+=num[i];
    }
    int avg = sum/num.length;
    int count=0;
    for (int i=1; i<num.length; i++){
      if (num[i] > avg){
        count++;
      }
    }
    System.out.println(count++);
    for (int i = 0; i<num.length; i++){
      if (num[i] > avg){
       System.out.print(num[i]); 
      }
    }
  }
}