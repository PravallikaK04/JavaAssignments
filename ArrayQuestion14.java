// File: ArrayQuestion14.java
import java.util.Arrays;

public class ArrayQuestion14 {
    public static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Second largest number: " + findSecondLargest(arr));
    }
}
