public class Prog01{
  public static void main(String [] args){
    Student s=new Student();
    s.age = 400;
    System.out.println(s.age);
    Student k= s;
    System.out.println(k.age);
  }
}