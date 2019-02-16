import java.util.Scanner;

public class CSE111Lab6Task05{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter first string");
    String str = nextLine();
    
    char [] s1=str.toCharArray();
    char ch1 = sc.next().charAt(0);   //oldChar
    char ch2 = sc.next().charAt(0);   //newChar
    
    int index=-1;
    for(int i=0; i<s1.length; i++){
      if(s1[]==ch1){
        index=i;
        break;
      }
    }
    if(index>=0){
      s1[index]=ch2;
      
    }
  }
}