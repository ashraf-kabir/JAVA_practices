import java.util.*;
public class L9T6{
  public static void main (String[] args){
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number quantity");  //normal prompt of range
        int m=sc.nextInt();
        
        int[] num=new int[m];         //array initialise
        int v;
        for (v=0; v<num.length; v++){
            System.out.println("Please enter a number");
            num[v]=sc.nextInt();
        }
        
        int min=0, minlocation;
        for (int k=0; k<num.length-1; k++){
            min=num[k];
            minlocation=k;
            for (v=k+1; v<num.length; v++){
              if (num[v]<min){
                    min=num[v];
                    minlocation=v;
                }
            }        
            num[minlocation]=num[k];
            num[k]= min;            
        }
        double median;
        if (m%2==0){
            median=(num[m/2]+num[m/2-1])/2.0;
            System.out.println("The median is "+median);
        }
        else{
            median=num[m/2+1];
            System.out.println("The median is "+median);
        }
    }
}
