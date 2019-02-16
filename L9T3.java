import java.util.Scanner;

public class L9T3{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int num[]=new int[5];

    
    for (int a=0; a<num.length; a++){
      System.out.println("Enter number:");
      num[a] = sc.nextInt();
    }
    int max=num[0];
    int min=num[0];
    int maxLocation=0;
    int minLocation=0;
    
    for (int b=0; b<num.length; b++){
      if (num[b]>max){
        max=num[b];
        maxLocation=b;
      }
    }

    for (int d=0; d<num.length; d++){
      if (num[d]<min){
        min=num[d];
        minLocation=d;
      }
    }
    System.out.print(max);
    System.out.println(maxLocation);
    
    System.out.print(min);
    System.out.println(minLocation);
  }
}
