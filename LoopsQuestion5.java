// File: LoopsQuestion5.java
public class LoopsQuestion5 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        if (a > b && a > c) {
            System.out.println(a + " is the largest number");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest number");
        } else {
            System.out.println(c + " is the largest number");
        }
    }
}
