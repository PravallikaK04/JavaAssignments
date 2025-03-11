public class MetOvQues3 {
    public static void methodExample(double a) {
        System.out.println("Method with one double parameter: " + a);
    }

    public static void methodExample(double a, double b) {
        System.out.println("Method with two double parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        methodExample(10.5);
        methodExample(3.5, 7.5);
    }
}
