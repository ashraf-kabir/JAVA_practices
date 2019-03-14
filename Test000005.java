public class Test000005{
    
    public static void main(String[] args) {
        String string = "bla*h";
        StringBuilder sb = new StringBuilder(string);
        sb.deleteCharAt(4);
        // Prints out "blah"
        System.out.println(sb.toString());
    }
    
}