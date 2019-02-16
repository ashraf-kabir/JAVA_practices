import java.util.*;

public class Rotate001{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number for right rotation: ");
    int orderToRotate=sc.nextInt();     //right rotate
    
    int []unOrderedArr = {1,2,3,4,5,6,7,8,9,10};
    
    for(int i=0; i<orderToRotate; i++){
      for(int j=unOrderedArr.length-1; j>0; j--){
        int temp=unOrderedArr[j];
        unOrderedArr[j]=unOrderedArr[j-1];
        unOrderedArr[j-1]=temp;
      }
    }
    for(int d=0; d<unOrderedArr.length; d++){
      System.out.print(unOrderedArr[d]+", ");
    }
    System.out.println();
  }
}
