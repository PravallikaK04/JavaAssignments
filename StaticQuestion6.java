// File: StaticQuestion6.java
public class StaticQuestion6 {
    static int staticVar1 = 10;
    static int staticVar2 = 20;
    
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    public static void main(String[] args) {
        // Print static variables
        System.out.println("Static variable 1 in main method: " + staticVar1);
        System.out.println("Static variable 2 in main method: " + staticVar2);
        
        // Create an instance to access instance variables
        StaticQuestion6 obj = new StaticQuestion6();
        System.out.println("Instance variable 1 in main method: " + obj.instanceVar1);
        System.out.println("Instance variable 2 in main method: " + obj.instanceVar2);
    }
}
