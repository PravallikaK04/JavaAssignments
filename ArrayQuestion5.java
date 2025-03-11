// File: ArrayQuestion5.java
import java.util.ArrayList;

public class ArrayQuestion5 {
    public static int[] removeElement(int[] arr, int element) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num != element) {
                list.add(num);
            }
        }
        int[] newArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = removeElement(arr, 3);
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
