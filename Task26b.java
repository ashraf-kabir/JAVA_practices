import java.util.Scanner;
public class Task26b{
public static void main(String[] args)
{    
    int j = 2;
    int result = 0;
    int number = 0;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter a number: ");
    number = sc.nextInt();
    while (j <= number / 2)
    {
        if (number % j == 0)
        {
           result = 1;
        }
        j++;
    }
    if (result == 1)
    {
        System.out.println("Number: " + number + " is Not Prime.");
    }
    else
    {
        System.out.println("Number: " + number + " is Prime. ");
    }
}

}