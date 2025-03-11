// File: ArrayQuestion6.java
public class ArrayQuestion6 {
    public static int[] copyArray(int[] arr) {
        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copiedArr = copyArray(arr);
        for (int num : copiedArr) {
            System.out.print(num + " ");
        }
    }
}
