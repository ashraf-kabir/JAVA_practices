public class Test02 {
static int total = 10;
public static void main (String args []) {
new Test();
}
public void Test () {
System.out.println("In test");
System.out.println(this);
int temp = this.total;
if (temp > 5) {
System.out.println(temp);
}
}
}
