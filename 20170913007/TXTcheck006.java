import java.io.*;
import java.util.*;

public class TXTcheck006 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(new File("info05.txt"));
        
        int numTimes = sc.nextInt();
        sc.nextLine();
        
        for (int i=0; i<numTimes; i++){
            String[] split = sc.nextLine().split(" ");
            String name = split[0];
            double dollars = Double.parseDouble(split[1]);
            double tokens = dollars*4;
            int tickets = Integer.parseInt(split[2]);
            double perToken = tickets/tokens;
            
            System.out.printf("%s received %.2f tickets for every tocken.\n", name, perToken);        }
    }
}
