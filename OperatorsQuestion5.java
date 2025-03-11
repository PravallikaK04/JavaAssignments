// File: OperatorsQuestion5.java
public class OperatorsQuestion5 {
    public static void checkLogicalOperators(boolean a, boolean b) {
        System.out.println("a AND b: " + (a && b));
        System.out.println("a OR b: " + (a || b));
        System.out.println("NOT a: " + !a);
    }

    public static void main(String[] args) {
        checkLogicalOperators(true, false);
    }
}
