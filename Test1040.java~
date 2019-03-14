import java.util.Scanner;

public class Test1040{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();
    double d=sc.nextDouble();
    
    double avg=(a*2+b*3+c*4+d*1)/10.0;
    System.out.printf("Media: %.1f\n", avg);
    
    if(avg>=7.0){
      System.out.println("Aluno aprovado.");
    }
    else if(avg<5.0){
      System.out.println("Aluno reprovado.");
    }
    
    else if(avg>5.0 && avg<6.9){
      System.out.println("Aluno em exame.");
      double x=sc.nextDouble();
      System.out.println("Nota do exame: "+x);
      
      double favg=(avg+x)/2.0;
      if(favg >=5.0){
        System.out.println("Aluno aprovado.");
      }
      else{
        System.out.println("Aluno reprovado.");
      }
      System.out.printf("Media final: %.1f\n", favg);
    }
  }
}
