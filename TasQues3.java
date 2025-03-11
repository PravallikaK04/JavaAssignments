class TasQues3 {
    int a;

    // Constructor with a parameter
    TasQues3(int a) {
        this.a = a;
        System.out.println("Constructor with parameter called: a = " + a);
    }

    // Default constructor using 'this()' to call the parameterized constructor
    TasQues3() {
        this(10);  // Calling parameterized constructor with a default value
        System.out.println("Default constructor called");
    }

    public static void main(String[] args) {
        TasQues3 obj = new TasQues3();  // This will call the default constructor
    }
}