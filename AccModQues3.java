// File: AccModQues3.java (same package)
class AccModQues3 {
    // PROTECTED fields
    protected String name = "Bob";
    protected int age = 40;

    // PROTECTED method
    protected void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Accessing protected fields and methods in the same package
        AccModQues3 obj = new AccModQues3();
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        obj.displayDetails();
    }
}
