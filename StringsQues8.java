// File: StringsQues8.java
public class StringsQues8 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        
        // Using equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));
        
        // Using startsWith()
        System.out.println("Starts with 'He': " + str1.startsWith("He"));
        
        // Using endsWith()
        System.out.println("Ends with 'lo': " + str1.endsWith("lo"));
        
        // Using compareTo()
        System.out.println("Compare to 'hello': " + str1.compareTo(str2));
    }
}
