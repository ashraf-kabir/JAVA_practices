public class Q3A {  
    public static void main(String[] args) {
        int x = 0, y =102, sum = 0;
        while (y > 8){
            if (sum < 40) {
                sum += x * 4 ;
            } else if (sum < 50) {
                sum += x * 2; 
            } else {
                sum += 13;
            }
            System.out.println(sum);
            y -= 10;
            x += 2;
        }
    }
}
