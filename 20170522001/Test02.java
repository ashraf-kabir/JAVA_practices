import java.util.*;

public class Test02{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter second/s: ");
    int input=sc.nextInt();
    
    int day = input/86400;
    int hr = (input%86400)/3600;
    int min = ((input%86400)%3600)/60;
    int sec = ((input%86400)%3600)%60;
    
    if (day==0){
      System.out.printf(hr+" hour(s) "+min+" minute(s) "+sec+" seconds."+"\n");
      
    }
    break;
    if (hr==0){
      System.out.printf(min+" minute(s) "+sec+" seconds."+"\n");
      
    }
    break;
    if (min==0){
      System.out.printf(sec+" seconds."+"\n");
      
    }
    break;
    
    
    //System.out.printf(day+" day(s) "+hr+" hour(s) "+min+" minute(s) "+sec+" seconds."+"\n");
  }
}
