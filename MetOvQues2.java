public class MetOvQues2 {
    public static void methodExample(String s) {
        System.out.println("Method with one String parameter: " + s);
    }

    public static void methodExample(int a, String s) {
        System.out.println("Method with one int and one String parameter: " + a + ", " + s);
    }

    public static void main(String[] args) {
        methodExample("Hello");
        methodExample(5, "World");
    }
}
