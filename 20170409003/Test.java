public class Test{
    public static void main(String[] args){
        
        
        Foo foo1 = new Bar();
        Foo foo2 = new Baz();
        Bar bar1 = new Bar();
        Baz baz1 = new Baz();
        Baz baz2 = new Mumble();
        Object obj1 = new Bar();
        
        //((Baz)obj1).method2();
//obj1.method1();
//((Mumble)baz1).method3();
//foo1.method2();
//((Bar)foo2).method2();
//foo2.method2();
//bar1.method2();
//((Foo)obj1).method2();
//foo1.method1();
//baz1.method2();
//baz2.method2();
//((Object)bar1).method3();
//((Foo)baz2).method3();
//foo2.method1();
//((Mumble)baz2).method3();
//bar1.method1();
//baz1.method1();
//((Baz)foo2).method3();
//baz2.method1();
        ((Bar)foo1).method3();
        
        
    }
}