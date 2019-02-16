import java.io.*;
import java.util.*;

public class TXTcheck001{
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(new File("something.txt"));
        
        System.out.println(sc.next());
    }
}