public class Q2a {
    public static void main(String[] args) {
        int x = 0, y = 0, sum = 0;
        double p;
        while(x < 20) {
            y = x / 2;
            while(y < x) {
                p = (x + 15.0)/2;
                sum = (sum + 3) + x + y * 3 + (int)p;
                System.out.println(sum);
                y += 3;
            }
            x += 3;
        }
        System.out.println("sum = (sum + 3) + x + y * 3 + (int)p");
    }
}
