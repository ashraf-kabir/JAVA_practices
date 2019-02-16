// mark
import java.util.Scanner;
public class mark{
    public static void main(String [] args){
      
        Scanner num= new Scanner(System.in);
        System.out.println("please enter your mark");
        int mark=num.nextInt();
        if(mark>=0||mark<=100){
          
            if(mark>=90){
                System.out.println("A");
            }
            else if(mark>=85)
            {
                System.out.println("A-");
            }
            else if(mark>=80)
            {
                System.out.println("B+");
            }
            else if(mark>=75)
            {
                System.out.println("B");
            }
            else if(mark>=70)
            {
                System.out.println("B-");
            }
            else if(mark>=65)
            {
                System.out.println("C+");
            }
            else if(mark>=60)
            {
                System.out.println("C");
            }
            else if(mark>=57)
            {
                System.out.println("C-");
            }
            else if(mark>=55)
            {
                System.out.println("D+");
            }
            else if(mark>=52)
            {
                System.out.println("D");
            }
            else if(mark>=50)
            {
                System.out.println("D-");
            }
            else if(mark<50)
            {
                System.out.println("F");
            }
        }
    }
}
