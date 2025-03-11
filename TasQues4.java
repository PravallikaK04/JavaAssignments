class TasQues4 {
    int a;
    String name;

    // Constructor with arguments
    TasQues4(int a, String name) {
        this.a = a;
        this.name = name;
        System.out.println("Constructor with arguments called: a = " + a + ", name = " + name);
    }

    // Constructor with default arguments using 'this()'
    TasQues4() {
        this(10, "Default Name");  // Calling constructor with arguments
        System.out.println("Default constructor called");
    }

    public static void main(String[] args) {
        TasQues4 obj = new TasQues4();  // Calls default constructor
    }
}