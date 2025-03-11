// File: IntfQues11.java
interface MyInterface {
    static final int CONSTANT = 42;  // Static final variable
}

public class IntfQues11 implements MyInterface {
    public static void main(String[] args) {
        System.out.println("Static final variable from interface: " + MyInterface.CONSTANT);
    }
}
