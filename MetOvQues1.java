public class MetOvQues1 {
    public static void methodExample(int a) {
        System.out.println("Method with one int parameter: " + a);
    }

    public static void methodExample(int a, int b) {
        System.out.println("Method with two int parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        methodExample(5);
        methodExample(5, 10);
    }
}
