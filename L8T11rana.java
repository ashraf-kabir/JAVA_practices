import java.util.Scanner;

public class L8T11rana{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    int num[] = new int[10];
    
    System.out.println("input number 1");
    num[0] = sc.nextInt();
    
    for (int c=1; c<num.length; c++){
      System.out.println("input number " + (c+1));
      num[c] = sc.nextInt();
      for (int n=0; n<c; n++){
        if (num[c] == num[n]){
          System.out.println("You cannot input a duplicate number.... please input again the last number");
          c--;
        }
      }
    }
    for (int c=0; c<num.length; c++){
      System.out.println(num[c]);
    }
  }
}
