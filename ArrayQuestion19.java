// File: ArrayQuestion19.java
public class ArrayQuestion19 {
    public static int findMissingNumber(int[] arr) {
        int sum = 0;
        // Sum the elements in the array
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        int expectedSum = 5050; // Sum of numbers from 1 to 100
        return expectedSum - sum; // Missing number
    }

    public static void main(String[] args) {
        int[] arr = new int[99]; // Array of size 99, missing one number (e.g., 50)
        int num = 1;
        int i = 0;
        
        // Create the array with numbers 1 to 100, excluding 50
        while (num <= 100) {
            if (num != 50) {  // Skip number 50
                arr[i] = num;
                i++;
            }
            num++;
        }
        
        System.out.println("Missing number: " + findMissingNumber(arr));
    }
}
