public class MetOvQues4 {
    public static void methodExample(int a, String s) {
        System.out.println("Method with int and String parameters: " + a + ", " + s);
    }

    public static void methodExample(String s, int a) {
        System.out.println("Method with String and int parameters: " + s + ", " + a);
    }

    public static void main(String[] args) {
        methodExample(5, "Hello");
        methodExample("Hello", 5);
    }
}
