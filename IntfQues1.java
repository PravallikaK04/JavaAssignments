// File: IntfQues1.java
interface MyInterface {
    void displayMessage();
}

public class IntfQues1 implements MyInterface {
    @Override
    public void displayMessage() {
        System.out.println("Hello, this is the implemented method!");
    }

    public static void main(String[] args) {
        MyInterface obj = new IntfQues1();
        obj.displayMessage();  // Calling the implemented method
    }
}
