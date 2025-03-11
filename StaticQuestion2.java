// File: StaticQuestion2.java
public class StaticQuestion2 {
    static int staticVar = 10;
    int instanceVar = 20;

    public static void printInstanceInStatic() {
        StaticQuestion2 obj = new StaticQuestion2(); // Create object to access instance variable
        System.out.println("Instance variable in static method: " + obj.instanceVar);
    }

    public static void main(String[] args) {
        printInstanceInStatic(); // Calling static method from main
    }
}
