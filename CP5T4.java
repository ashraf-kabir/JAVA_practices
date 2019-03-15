import java.util.Scanner;

public class CP5T4{
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
        int num[] = new int[5];
        int max=num[0];
        int maxPosition=0;
        
        for (int a=0; a<num.length; a++){
            System.out.println("Enter number:");
            num[a] = sc.nextInt();
        }
        
        for (int b=0; b<num.length; b++){
            if (num[b]>max){
                max=num[b];
                maxPosition=b;
            }
        }
        System.out.println(max + " is the largest number & it's position at index is " + maxPosition);
    }
}