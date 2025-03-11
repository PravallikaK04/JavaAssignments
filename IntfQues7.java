// File: IntfQues7.java
interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

public class IntfQues7 implements ChildInterface {
    @Override
    public void parentMethod() {
        System.out.println("Parent method implemented.");
    }

    @Override
    public void childMethod() {
        System.out.println("Child method implemented.");
    }

    public static void main(String[] args) {
        IntfQues7 obj = new IntfQues7();
        obj.parentMethod();
        obj.childMethod();
    }
}
