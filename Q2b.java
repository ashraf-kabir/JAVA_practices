public class Q2b {
  public static void main(String[] args) {
    int x = 0, y = 0;         
    double p = 0, sum = 0;         
    while(x < 20) {             
      y = x / 2;             
      while(y < x) {                 
        p = (x + 15.0)/2;                 
        sum = (sum + 8) + x + y * 2 + (int)p;                 
        System.out.println(sum);                 
        y += 3;             
      }             
      x += 3;         
    }         
    System.out.println(sum = (sum + 8) + x + y * 2 + p);     
  } 
} 