import java.io.*;
import java.util.*;

public class TXTcheck005 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(new File("info04.txt"));
        
        int numTimes = sc.nextInt();
        sc.nextLine();
        
        for (int i=0; i<numTimes; i++){
            int sum=0;
            int count=0;
            
            String[] split = sc.nextLine().split(" ");
            
            for (int j=0; j<split.length; j++){
                sum+=Integer.parseInt(split[j]);
                count++;
            }
            System.out.println("The average is = "+ ((double) sum/count));
        }
    }
}
