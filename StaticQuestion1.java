// File: StaticQuestion1.java
public class StaticQuestion1 {
    // Static variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // Instance variables
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    // Static methods
    public static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    public static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    // Instance methods
    public void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    public void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    // Main method
    public static void main(String[] args) {
        StaticQuestion1 obj = new StaticQuestion1(); // Creating an object of the class
        System.out.println("Main Method");
        obj.instanceMethod1();  // Calling instance method from main
        staticMethod1();  // Calling static method from main
    }
}
