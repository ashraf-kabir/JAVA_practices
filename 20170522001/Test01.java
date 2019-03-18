import java.util.*;

public class Test01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter second/s: ");
        int input = sc.nextInt();

        int day = input / 86400;
        int hr = (input % 86400) / 3600;
        int min = ((input % 86400) % 3600) / 60;
        int sec = ((input % 86400) % 3600) % 60;

        System.out.printf(day + " day(s) " + hr + " hour(s) " + min + " minute(s) " + sec + " seconds." + "\n");
    }
}
