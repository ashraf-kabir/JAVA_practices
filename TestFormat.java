import java.util.Calendar;
import java.util.Locale;

public class TestFormat {
    
    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance();
        
        System.out.format("%tB %te, %tY%n", c, c, c);
        
        System.out.format("%tl:%tM %tp%n", c, c, c);
    }
}
