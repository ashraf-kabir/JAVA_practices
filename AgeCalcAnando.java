import java.util.Scanner;
public class AgeCalcAnando {
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int month [] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    System.out.println("enter your birth year");
    int byear = sc.nextInt();
    System.out.println("enter your birth month");
    int bmonth = sc.nextInt();
    System.out.println("enter your birthday");
    int bday = sc.nextInt();
    System.out.println("enter current year");
    int pyear = sc.nextInt();
    System.out.println("enter current month");
    int pmonth = sc.nextInt();
    System.out.println("enter current day");
    int pday = sc.nextInt();
    
    int yearCount;
    int monthCount;
    if(pmonth>=bmonth){
    yearCount= pyear-byear;
    monthCount = pmonth-bmonth;
    } else{
      yearCount= pyear-byear-1;
      monthCount = 12-bmonth+ pmonth;
    }
    int day;
    if(pday<bday){
      if(pyear%4==0){
        month[2]++;
        day = month[pmonth]-pday+bday;
        month[2]--;
      }
      else{
        day = month[pmonth]-pday+bday;
      }
    } else {
      day = pday-bday;
    }
    System.out.println("Your age is " + yearCount+ " years " + monthCount + " months " + day + " days");
  }
}
