public class MyClass {
    public static void main(String[] args) {
        Student s1 = new Student();       //s1 is a object
        s1.name = "Ashraf";
        s1.id = 16301034;
        s1.age = 21;
        
        System.out.println(s1.name.concat(" is ")+s1.age+ " years old and his ID is "+ s1.id);
    }
}