import java.io.*;
import java.util.*;

public class TXTcheck004 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(new File("info03.txt"));
        
        int numTimes = sc.nextInt();
        sc.nextLine();
        
        for (int i=0; i<numTimes; i++){
            int sum=0;
            int count=0;
            Scanner split = new Scanner(sc.nextLine());
            
            while (split.hasNextInt()){
                sum+=split.nextInt();
                count++;
            }
            System.out.println("The average is = "+ ((double) sum/count));
        }
    }
}
