import java.util.Scanner;

public class Test1065{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    int num[]= new int[5];
    int d=0;
    
    for(int a=0; a<num.length; a++){
      num[a]=sc.nextInt();
      if(num[a]%2==0){
        d++;
      }
    }
    System.out.println(d+" valores pares");
  }
}