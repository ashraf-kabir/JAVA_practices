import java.util.Scanner;

public class Vabna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your First name/ Middle name/ Last name: ");
        String x = sc.nextLine();
        
        if (x.startsWith("V") || x.startsWith("v") && x.endsWith("a")) {
            System.out.println("Hello, ".concat(x));
        } else if (x.startsWith("S") || x.startsWith("s") && x.endsWith("a")) {
            System.out.println("Hello, ".concat(x));
        } else if (x.startsWith("H") || x.startsWith("h") && x.endsWith("n")) {
            System.out.println("Hello ".concat(x));
        } else {
            System.out.println("Sorry, you are not the right person.");
        }
        
        System.out.println("Please enter your birth year:");
        int birthYear = sc.nextInt();
        int count = 0;
        for (; birthYear <= 2016; birthYear++) {
            count++;
        }
        if (count > 0 && count < 13) {
            System.out.print(x + ", your name has only " + x.length() + " alphabets. ");
            System.out.print("But you are a child only please grow up");
        } else if (count >= 13 && count <= 19) {
            System.out.print(x + ", your name has only " + x.length() + " alphabets. ");
            System.out.print("But you are a teenager");
        } else if (count > 19) {
            System.out.print(x + ", your name has only " + x.length() + " alphabets. ");
            System.out.print("But you are matured enough");
        }
        System.out.print(" and " + count + " years old.");
        System.out.println();
        System.out.println("Happy Birthday to you, may Allah bless you and live long!");
        System.out.println();
        System.out.println("Please input 1 if you're willing to take a gift from me or input 0 to ignore.");
        int gift = sc.nextInt();
        if (gift == 1) {
            System.out.println("Just wait a minute!");
        } else if (gift == 0) {
            System.out.println("As you said no I've nothing to do :3 ");
        }
    }
    
}
