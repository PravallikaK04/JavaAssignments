// File: ArrayQuestion10.java
import java.util.HashSet;

public class ArrayQuestion10 {
    public static void findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        for (int num : duplicates) {
            System.out.println("Duplicate value: " + num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        findDuplicates(arr);
    }
}
