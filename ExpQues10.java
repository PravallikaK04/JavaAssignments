public class ExpQues10 {
    public static void main(String[] args) {
        try {
            Class.forName("NonExistingClass");  // This will throw ClassNotFoundException
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }
}
