class ConQues5 {
    ConQues5() {
        System.out.println("Constructor Called");
    }

    void callConstructor() {
        // We cannot explicitly call a constructor again on the same object
        // But we can simulate it by creating a new object
        new ConQues5();
    }

    public static void main(String[] args) {
        ConQues5 obj = new ConQues5();
        obj.callConstructor();  // Creating a new object to "simulate" multiple constructor calls
        obj.callConstructor();
    }
}

