public class QuadEqn
{
  int a,b,c;
  double d;
  public void setA(int a)
  {
    this.a=a;
  }
  public void setB(int b)
  {
    this.b=b;
  }
  public void setC(int c)
  {
    this.c=c;
  }
  
  public int getA()
  {
    return a;
  }
  public int getB()
  {
    return b;
  }
  public int getC()
  {
    return c;
  }
  public void Print()
  {
    if(b>0 && c>0)
    {
      System.out.println(a+"x2"+" "+"+"+b+"x"+" "+"+"+c);
    }
    if(b>0 && c<0)
    {
      System.out.println(a+"x2"+" "+"+"+b+"x"+" "+c);
    }
    if(b<0 && c>0)
    {
      System.out.println(a+"x2"+" "+b+"x"+" "+"+"+c);
    }
    if(b<0 && c<0)
    {
      System.out.println(a+"x2"+" "+b+"x"+" "+c);
    }
  }
  public void Root()
  {
    d=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
    System.out.println("Root "+ d);
  }
}


