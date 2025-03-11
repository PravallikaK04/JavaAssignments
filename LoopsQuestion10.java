// File: LoopsQuestion10.java
public class LoopsQuestion10 {
    public static void main(String[] args) {
        int num = 121, reversed = 0, remainder, original;
        original = num;
        while (num != 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}
