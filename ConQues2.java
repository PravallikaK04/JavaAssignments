class ConQues2 {
    ConQues2() {
        System.out.println("Parent Default Constructor");
    }

    ConQues2(int a) {
        System.out.println("Parent Argument Constructor: " + a);
    }
}

class Child extends ConQues2 {
    Child() {
        super(); // Calls Parent's Default Constructor
        System.out.println("Child Default Constructor");
    }

    Child(int b) {
        super(b); // Calls Parent's Argument Constructor
        System.out.println("Child Argument Constructor: " + b);
    }

    public static void main(String[] args) {
        new Child();
        new Child(50);
    }
}

