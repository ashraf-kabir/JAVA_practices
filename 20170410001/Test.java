public class Test{
    public static void main(String[] args){
        
        A a1= new A(2);
        B b1= new B(3);
        B b2= new B(b1);
        a1.methodB(1,1);
        b2.methodB(1,2);
        b2.methodB(2,2);
    }
}