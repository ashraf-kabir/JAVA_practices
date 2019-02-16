public class Scope{
  private int x = 10;
  private int y = 9999;
  public void m1(){
    int x = 10;
    x = x + 10;
    System.out.println(x);
    System.out.println(y);
    y = y + 1;
  }
  public void m2(){
    int y = 9;
    this.y = y + 1;
    System.out.println(x);
    System.out.println(y);    
    x = this.x + 10;
  }
  
}