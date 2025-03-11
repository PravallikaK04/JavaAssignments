// File: IntfQues5.java
interface Interface1 {
    void commonMethod();
}

interface Interface2 {
    void commonMethod();
}

public class IntfQues5 implements Interface1, Interface2 {
    @Override
    public void commonMethod() {
        System.out.println("Common method implemented from both interfaces.");
    }

    public static void main(String[] args) {
        IntfQues5 obj = new IntfQues5();
        obj.commonMethod();  // Calling the method from both interfaces
    }
}
