// File: AccModQues2.java
class AccModQues2 {
    // DEFAULT fields (no access modifier)
    String name = "Alice";
    int age = 30;

    // DEFAULT method (no access modifier)
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Accessing the default fields and methods
        AccModQues2 obj = new AccModQues2();
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        obj.displayDetails();
    }
}
