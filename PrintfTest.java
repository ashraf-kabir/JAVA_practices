import java.util.Scanner;
public class PrintfTest {  
    public static void main(String[]args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter BD time");
        double TBD=sc.nextDouble();
        double IndiaTime=TBD-0.70;
        double PakTime=TBD-1.00;
        
        if(TBD<=12){
            double USATime=TBD+12.00;
            System.out.printf("Current USA Time is %.2f\n",USATime);
        }
        else {
            double USATime=TBD-12.00;
            System.out.printf("Current USA Time is %.2f\n",USATime);
        }
        
        double AbuDhabiTime=TBD-2.00;
        System.out.printf("Current India Time is %.2f\n",IndiaTime);
        System.out.printf("Current Pakistan Time is %.2f\n",PakTime);
        System.out.printf("Current Abu Dhabi Time is %.2f\n",AbuDhabiTime);
    }
}
