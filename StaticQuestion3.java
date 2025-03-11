// File: StaticQuestion3.java
public class StaticQuestion3 {
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    public void printStaticInInstance() {
        System.out.println("Static variable 1 in instance method: " + staticVar1);
        System.out.println("Static variable 2 in instance method: " + staticVar2);
    }

    public static void main(String[] args) {
        StaticQuestion3 obj = new StaticQuestion3();
        obj.printStaticInInstance();  // Calling instance method from main
    }
}
