import java.util.*;
import static java.lang.System.out;

public class Task08{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int P=1;
    out.println("Enter coloumn number: ");
    int Q = sc.nextInt();
    
    int [][]a = new int[P][Q];
    int [][]b = new int[P][Q];
    int [][]c = new int[P][Q];
    
    for(int i=0; i<P; i++){
      for(int j=0; j<Q; j++){
        out.println("Enter a number for the first one: ");
        a[i][j]= sc.nextInt();
      }
    }
    for(int i=0; i<P; i++){
      for(int j=0; j<Q; j++){
        out.println("Enter a number for the second one: ");
        b[i][j]= sc.nextInt();
      }
    }
    for(int i=0; i<P; i++){
      for(int j=0; j<Q; j++){
        c[i][j]=(5*a[i][j])- b[i][j];
      }
    }
    for(int i=0; i<P; i++){
      for(int j=0; j<Q; j++){
        out.print(c[i][j]+" ");
      }
      out.println();
    }
  }
}
