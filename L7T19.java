import java.util.Scanner;
public class L7T19{
  public static void main (String[]args){
    
    Scanner norm=new Scanner (System.in);

    int height=0, c=1, space=0;

    System.out.println("what will be the height?");

    height=norm.nextInt();

    while (c<=height){
      space=height-c;
      while (space>0){
        System.out.print(" ");
        space--;
      }

      int i=1, j=(height+1)-c;

      while (i<=c){
        if ((c==1) || (c==height) || (i==1) || (i==c)){
          System.out.print(j);
          j++;
        }
        else{
          System.out.print(" ");
        }
        i++;
      }
      
      System.out.println();
      c++;
      }
  }

}
