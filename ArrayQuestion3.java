// File: ArrayQuestion3.java
public class ArrayQuestion3 {
    public static int findIndexOfElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Index of element 30: " + findIndexOfElement(arr, 30));
    }
}
