import java.util.Scanner;
public class ar1{
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter number:");
        int arr[] = new int[10]; //10 array prompt
        
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        int max= arr[0], maxposition=0;    //to find maximum value and its index position
        for (int i=1; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
                maxposition=i;
            }
        }
        System.out.print(max + " " + maxposition);
    }
}
