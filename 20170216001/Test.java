public class Test{
  public static void main(String[] args){
    
    Scope obj = new Scope();
    
    obj.m1();
    obj.m2();
    obj.m1();
    obj.m2();
  }
}