public class Tester {

    int x = 1;

    void methodA() {
        //Uncomment each line at a time and check the value of test
        //Only one line should be uncommented at a time
        //int test = x + methodB();
        //int test = methodB() + x;
        int test = x + methodB() + x;
        //int test = methodB() + x + methodB();
        System.out.println("Value of test: " + test);

    }

    int methodB() {
        x = 5;
        return 9;
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.methodA();
    }

}
