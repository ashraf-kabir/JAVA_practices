public class LabMidtracingsec8B {
  public static void main(String args[]) {
    String test = "";
    int i = 0, j = 0, k = 15;
    while (i < 2){
      test = "-->";
      j = --k;
      while (j > 10 ){
        test = i * j + "-->" + test;
        System.out.println(test);
        j--;
      }
      i++;
    }
  }
}