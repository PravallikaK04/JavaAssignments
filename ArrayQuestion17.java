// File: ArrayQuestion17.java
public class ArrayQuestion17 {
    public static boolean containsTwoElements(int[] arr, int elem1, int elem2) {
        boolean containsFirst = false, containsSecond = false;
        for (int num : arr) {
            if (num == elem1) containsFirst = true;
            if (num == elem2) containsSecond = true;
        }
        return containsFirst && containsSecond;
    }

    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45};
        System.out.println("Contains 12 and 23: " + containsTwoElements(arr, 12, 23));
    }
}
