import java.util.Scanner;
public class CSE111Lab06Task04c
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter a string: ");
        String s = sc.nextLine();
        System.out.println("Please enter another string to check: ");
        String s2 = sc.nextLine();
        char [] ch = s.toCharArray();
        char [] ch2 = s2.toCharArray();
        
        if(ch2.length>ch.length)
        {
            System.out.println("false");
        }
        else
        {
            int flag=0;
            for (int i=ch2.length-1; i<=0; i--)
            {
                if(ch[i]==ch2[i])
                {}
                else
                {
                    flag+=1;
                    break;
                }
            }
            if (flag==0)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
    }
}