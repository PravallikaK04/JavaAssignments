// File: AbsQues4.java
abstract class AbstractClass {
    // Abstract method
    abstract void abstractMethod();

    // Non-abstract method
    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method.");
    }
}

public class AbsQues4 {
    public static void main(String[] args) {
        // Creating instance of the child class
        ConcreteClass concreteObj = new ConcreteClass();
        concreteObj.callNonAbstractMethod();  // Calling non-abstract method from within child class
    }
}

class ConcreteClass extends AbstractClass {
    // Implementing the abstract method
    @Override
    void abstractMethod() {
        System.out.println("Abstract method is implemented in the subclass.");
    }

    // Method to call non-abstract method
    void callNonAbstractMethod() {
        nonAbstractMethod();  // Calling non-abstract method
    }
}
