import java.util.Calendar;

public class TimeDate {
    
    public static void main(String[] args) {
        
        Calendar a = Calendar.getInstance();
        
        System.out.print("It is ");
        System.out.format("%tl:%tM %tp%n", a, a, a);
        
        System.out.print("The date is: ");
        System.out.format("%tB %te, %tY%n", a, a, a);
    }
}
