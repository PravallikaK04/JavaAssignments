// File: StaticQuestion7.java
public class StaticQuestion7 {
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    int instanceVar1 = 30;
    int instanceVar2 = 40;

    public static void staticMethod1() {
        System.out.println("Static Method 1 called");
    }

    public static void staticMethod2() {
        System.out.println("Static Method 2 called");
    }

    public void instanceMethod1() {
        System.out.println("Instance Method 1 called");
    }

    public void instanceMethod2() {
        System.out.println("Instance Method 2 called");
    }

    public static void main(String[] args) {
        // Calling static methods
        staticMethod1();
        staticMethod2();

        // Creating object to call instance methods
        StaticQuestion7 obj = new StaticQuestion7();
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
