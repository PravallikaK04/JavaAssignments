// File: IntfQues6.java
interface MyInterface {
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

public class IntfQues6 implements MyInterface {
    // No need to provide implementation for default method

    public static void main(String[] args) {
        IntfQues6 obj = new IntfQues6();
        obj.defaultMethod();  // Calling the default method
    }
}
