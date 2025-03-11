// File: AccModQues1.java
public class AccModQues1 {
    // PRIVATE fields
    private String name = "John";
    private int age = 25;

    // PRIVATE method
    private void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        AccModQues1 obj = new AccModQues1();
        // Printing private fields in main method
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        // Calling private method in main method
        obj.displayDetails();
    }
}

class SubClass extends AccModQues1 {
    public void tryAccessPrivate() {
        // Error: Cannot access private members of parent class
        // System.out.println(name);  // Cannot access 'name'
        // displayDetails(); // Cannot access 'displayDetails'
    }
}
