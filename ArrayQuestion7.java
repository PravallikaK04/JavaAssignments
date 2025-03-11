// File: ArrayQuestion7.java
import java.util.ArrayList;

public class ArrayQuestion7 {
    public static int[] insertElementAtPosition(int[] arr, int element, int position) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        list.add(position, element);
        
        int[] newArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int[] newArr = insertElementAtPosition(arr, 4, 3);
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
