import java.util.Scanner;
public class Task96
{public static void main (String[] args)
  {Scanner sc=new Scanner (System.in);
  System.out.println("Please tell how many numbers you want to enter");
  int num=sc.nextInt();
  int []a=new int[num];
   for(int count1=0;count1<a.length;count1++)
  {System.out.println("Please enter a number");
    a[count1]=sc.nextInt();
  }
   for(int count2=0;count2<a.length-1;count2++)
   {for(int count3=0;count3<a.length-1;count3++)
     {if(a[count3]<a[count3+1])
{int temp=a[count3];
  a[count3]=a[count3+1];
  a[count3+1]=temp;
}
}
}
   double median;
   if(num%2==0)
   {median=(a[num/2]+a[num/2-1])/2.0;
   }
   else
   {median=a[num/2+1]/2.0;
   }
   System.out.println(median);
}
}




   