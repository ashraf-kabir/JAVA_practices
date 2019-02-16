class Foo {
    public void method1() {
        System.out.println("foo method 1");    
    }
    
    public void method2() {
        System.out.println("foo method 2");
    }
}

class Bar extends Foo {
    public void method2() {
        System.out.println("bar method 2");
    }
    
    public void method3() {
        System.out.println("bar method 3");
    }
}

class Baz extends Foo {
    public void method1() {
        System.out.println("baz method 1");
    }
    
    public void method2() {     
        System.out.println("baz method 2");
        method1();
    }
}

class Mumble extends Baz {
    public void method1() {
        super.method1();
        System.out.println("mumble method 1");
    }
    
    public void method3() {
        System.out.println("mumble method 3");
    }
}
