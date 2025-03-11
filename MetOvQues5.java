public class MetOvQues5 {
    public static int methodExample(int a, int b) {
        return a + b;
    }

    public static double methodExample(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        int sum = methodExample(3, 4);
        double product = methodExample(3.0, 4.0);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
