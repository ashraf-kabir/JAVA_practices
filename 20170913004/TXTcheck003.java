import java.io.*;
import java.util.*;

public class TXTcheck003 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(new File("info02.txt"));
        
        int numTimes = sc.nextInt();
        sc.nextLine();
        
        for (int i=0; i<numTimes; i++){
            int sum=0;
            int count=0;
            for (int j=0; j<4; j++){
                sum+=sc.nextInt();
                count++;
            }
            System.out.println("The average is = "+ ((double) sum/count));
        }
    }
}
