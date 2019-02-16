public class Task8 {
  public static void main(String [] args){
    
    int sum=0;
    
    for(int c=0; c<=600; c++){
      if (c%7==0){
        sum=sum+c;
      }
      
      
      else if (c%9==0){
        sum=sum+c;
      }
      
    }
    System.out.println(sum);
  }
  
}
