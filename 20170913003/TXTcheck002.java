import java.io.*;
import java.util.*;

public class TXTcheck002 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(new File("info.txt"));
        
        while (sc.hasNext()) {
            String str = sc.nextLine().trim();
            System.out.println(str);
        }
    }
}
