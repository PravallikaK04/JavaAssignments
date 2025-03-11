// File: ArrayQuestion12.java
import java.util.HashSet;

public class ArrayQuestion12 {
    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] newArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            newArr[i++] = num;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 5};
        int[] result = removeDuplicates(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
