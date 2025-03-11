// File: ArrayQuestion2.java
public class ArrayQuestion2 {
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Average value: " + calculateAverage(arr));
    }
}
