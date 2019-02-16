public class Midterm{
  
  public static void main(String[] args){
    
    Dog scooby = new Dog();
    scooby.setAction("Barking");
    scooby.printDog();
    Dog odie = new Dog ("Red");
    odie.setAction("Sitting");
    odie.printDog();
    Dog goofy = new Dog("Blue");
    goofy.setAction("Eating");
    goofy.printDog();
    scooby.setColor("Brown");
    scooby.printDog();
  }
}
