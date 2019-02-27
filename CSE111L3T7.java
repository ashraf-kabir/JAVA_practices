public class CSE111L3T7{ 
    public static void main(String args[]) { 
        String word1="p"; 
        String word2="P"; 
        System.out.println(word1.compareTo(word2)); 
        System.out.println(word1.compareToIgnoreCase(word2));
        
        String word="          PrincesS  "; 
        System.out.println(word); 
        System.out.println(word.startsWith("RED")); 
        System.out.println(word.endsWith("sS")); 
        
        System.out.println(word1.equals(word2)); 
        System.out.println(word1.equalsIgnoreCase(word2));
        
        System.out.println(word.indexOf("p")); 
        System.out.println(word.lastIndexOf("S"));
        
        
        System.out.println(word.replace('s', 'S')); 
        System.out.println(word.substring(9));
        System.out.println(word.toCharArray());
        
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase()); 
        
        System.out.println(word.trim()); 
        
        System.out.println(String.valueOf(6)+9); 
        System.out.println(Integer.valueOf("12")+3);
    }
}
