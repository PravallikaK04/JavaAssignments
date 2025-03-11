// File: ArrayQuestion11.java
import java.util.HashSet;

public class ArrayQuestion11 {
    public static void findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                System.out.println("Common element: " + num);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        findCommonElements(arr1, arr2);
    }
}
