class ConQues3 {
    private ConQues3() {
        System.out.println("Private Constructor");
    }

    public ConQues3(int a) {
        System.out.println("Public Constructor: " + a);
    }

    protected ConQues3(String b) {
        System.out.println("Protected Constructor: " + b);
    }

    ConQues3(double c) {
        System.out.println("Default Constructor: " + c);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        new ConQues3(10);    // Public
        new ConQues3("Hello");  // Protected
        new ConQues3(20.5);  // Default

        // Private constructor cannot be accessed outside the class
        new ConQues3(); // Allowed here because it's the same class
    }
}

