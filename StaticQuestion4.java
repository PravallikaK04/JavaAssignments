// File: StaticQuestion4.java
public class StaticQuestion4 {
    static int staticVar = 10;

    public void instanceMethod() {
        System.out.println("Instance method called");
    }

    public static void staticMethod() {
        StaticQuestion4 obj = new StaticQuestion4();  // Creating object in static method
        obj.instanceMethod();  // Calling instance method from static method
    }

    public static void main(String[] args) {
        staticMethod();  // Calling static method from main
    }
}
