// File: StringsQues11.java
public class StringsQues11 {
    public static void main(String[] args) {
        String str = "Apple, Banana, Cherry";
        
        // Splitting the string
        String[] fruits = str.split(", ");
        
        // Printing the split result
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
