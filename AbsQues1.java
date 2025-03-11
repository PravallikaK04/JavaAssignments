// File: AbsQues1.java
abstract class AbstractClass {
    // Abstract method (no body)
    abstract void abstractMethod();

    // Non-abstract method (with body)
    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method.");
    }
}

public class AbsQues1 {
    public static void main(String[] args) {
        // AbstractClass obj = new AbstractClass(); // Cannot instantiate abstract class

        // Creating instance of a subclass that implements abstract method
        ConcreteClass concreteObj = new ConcreteClass();
        concreteObj.abstractMethod();  // Calling abstract method
        concreteObj.nonAbstractMethod();  // Calling non-abstract method
    }
}

class ConcreteClass extends AbstractClass {
    // Implementing the abstract method
    @Override
    void abstractMethod() {
        System.out.println("This is the abstract method implemented in the subclass.");
    }
}
