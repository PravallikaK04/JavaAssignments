// File: AccModQues4.java
public class AccModQues4 {
    // PUBLIC fields
    public String name = "Charlie";
    public int age = 50;

    // PUBLIC method
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Accessing public fields and methods
        AccModQues4 obj = new AccModQues4();
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        obj.displayDetails();
    }
}
