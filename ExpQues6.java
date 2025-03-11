class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ExpQues6 {
    public static void main(String[] args) {
        try {
            throw new MyException("This is my custom exception");
        } catch (MyException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
