// File: IntfQues4.java
interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

public class IntfQues4 implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Method from Interface1 implemented.");
    }

    @Override
    public void method2() {
        System.out.println("Method from Interface2 implemented.");
    }

    public static void main(String[] args) {
        IntfQues4 obj = new IntfQues4();
        obj.method1();
        obj.method2();
    }
}
