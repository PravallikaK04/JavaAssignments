// File: OperatorsQuestion7.java
public class OperatorsQuestion7 {
    public static void findSmallerAndLarger(int a, int b) {
        if (a > b) {
            System.out.println("Larger number: " + a);
            System.out.println("Smaller number: " + b);
        } else {
            System.out.println("Larger number: " + b);
            System.out.println("Smaller number: " + a);
        }
    }

    public static void main(String[] args) {
        findSmallerAndLarger(10, 5);
    }
}
