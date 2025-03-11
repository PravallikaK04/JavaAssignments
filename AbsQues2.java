// File: AbsQues2.java
abstract class AbstractClass {
    // Abstract method
    abstract void abstractMethod();

    // Non-abstract method
    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method.");
    }
}

public class AbsQues2 {
    public static void main(String[] args) {
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
        System.out.println("Abstract method implemented in subclass.");
    }
}
