import java.util.Scanner;
public class Test1021b{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    double D,E;
    double A=sc.nextDouble();
    
    int a,b,c,d,e,f,g,h,i,j,k,l,B,m,n,o,p,q,r,s,t,u;
    
    int N=(int)A;
    a=N/100;
    b=N%100;
    c=b/50;
    d=b%50;
    e=d/20;
    f=d%20;
    g=f/10;
    h=f%10;
    i=h/5;
    j=h%5;
    k=j/2;
    l=j%2;

    E=A*100;
    B=(int) E;
    m=B%100;
    n=m/50;
    o=m%50;
    p=o/25;
    q=o%25;
    r=q/10;
    s=q%10;
    t=s/5;
    u=s%5;
    
    System.out.printf("NOTAS:\n");
    System.out.printf("%d nota(s) de R$ 100.00\n",a);
    System.out.printf("%d nota(s) de R$ 50.00\n",c);
    System.out.printf("%d nota(s) de R$ 20.00\n",e);
    System.out.printf("%d nota(s) de R$ 10.00\n",g);
    System.out.printf("%d nota(s) de R$ 5.00\n",i);
    System.out.printf("%d nota(s) de R$ 2.00\n",k);
    
    System.out.printf("MOEDAS:\n");
    System.out.printf("%d moeda(s) de R$ 1.00\n",l);
    System.out.printf("%d moeda(s) de R$ 0.50\n",n);
    System.out.printf("%d moeda(s) de R$ 0.25\n",p);
    System.out.printf("%d moeda(s) de R$ 0.10\n",r);
    System.out.printf("%d moeda(s) de R$ 0.05\n",t);
    System.out.printf("%d moeda(s) de R$ 0.01\n",u);
  }
}