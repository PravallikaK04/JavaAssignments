class ConQues4 {
    // A constructor should not have a return type; this is incorrect.
    int ConQues4() {
        System.out.println("Constructor with return type int");
        return 10;
    }

    String ConQues4(String msg) {
        System.out.println("Constructor with return type String");
        return msg;
    }

    public static void main(String[] args) {
        ConQues4 obj = new ConQues4();
        int result = obj.ConQues4();
        String text = obj.ConQues4("Hello");

        System.out.println("Result: " + result);
        System.out.println("Text: " + text);
    }
}

