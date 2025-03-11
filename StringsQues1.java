// File: StringsQues1.java
public class StringsQues1 {
    public static void main(String[] args) {
        // Method 1: Using string literal
        String str1 = "Hello, World!";
        
        // Method 2: Using new keyword
        String str2 = new String("Hello, Java!");

        // Method 3: Using char array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        
        // Printing all strings
        System.out.println("String created using literal: " + str1);
        System.out.println("String created using new keyword: " + str2);
        System.out.println("String created using char array: " + str3);
    }
}
