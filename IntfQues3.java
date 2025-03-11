// File: IntfQues3.java
interface MyInterface {
    void displayMessage();
}

public class IntfQues3 implements MyInterface {
    @Override
    public void displayMessage() {
        System.out.println("This method is called through the interface instance!");
    }

    public static void main(String[] args) {
        MyInterface obj = new IntfQues3();
        obj.displayMessage();  // Calling the method through interface reference
    }
}
