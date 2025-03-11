// File: StaticQuestion5.java
public class StaticQuestion5 {
    static int staticVar = 10;

    public static void staticMethod() {
        System.out.println("Static method called");
    }

    public void instanceMethod() {
        staticMethod();  // Calling static method from instance method
    }

    public static void main(String[] args) {
        StaticQuestion5 obj = new StaticQuestion5();
        obj.instanceMethod();  // Calling instance method from main
    }
}
