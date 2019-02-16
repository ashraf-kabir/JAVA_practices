public class Task9test {
 public static void main(String [] args){
  int sum = 0;
  
  for( int i= 1; i<= 65; i++){
    
   if(i%7==0){
    if(i%9!=0){
     sum+=i;
    }
   }
   else if(i%9==0){
    sum+=i;
   }
  }
  System.out.println(sum);
 }

}