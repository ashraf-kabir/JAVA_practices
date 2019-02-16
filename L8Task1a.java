public class L8Task1a {
  public static void main(String[] args) {
    
    double z;
    
    double x = Math.PI;
    System.out.println(x);                 //16 deciaml output
    System.out.format("%.4f%n", x);        //4 decimal output & last digit will increase 1
    System.out.format("%10.4f%n", x);      //right justified 10 character, 4 decimal output & last digit will increase 
    System.out.format("%-10.5f%n", x);     //left justified 10 character, 5 decimal output & last digit will increase
    System.out.format("%+10.8f%n", x);     //sign
    
    System.out.println();
    
    double a = 9.55;
    double b = 5.33;
    
    double d=b-a;
    System.out.println(d);        //16 decimal output
    System.out.format("%f%n", d);        //6 decimal output
    System.out.format("%+.5f%n", d);       //5 decimal output with sign
    
    
    System.out.println();
    z = 5+Math.sin(80*Math.PI/180);
    System.out.format("%-10.4f%n",z);     //left justified with 10 character, 4 decimal
    System.out.format("%10.4f%n",z);     //right justified with 10 character, 4 decimal
    System.out.format("%f%n", z);       //6 decimal output
    System.out.format("%.4f%n", z);      //4 digit of decimal
    System.out.format("%.7f%n", z);      //7 digit of decimal
    
  }
}
