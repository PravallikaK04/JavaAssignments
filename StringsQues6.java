// File: StringsQues6.java
public class StringsQues6 {
    public static void main(String[] args) {
        String str = "Hello123";
        
        // Matching string with regular expression
        boolean matches = str.matches("Hello\\d+");
        
        System.out.println("Does the string match the pattern? " + matches);
    }
}
