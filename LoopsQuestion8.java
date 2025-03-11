// File: LoopsQuestion8.java
public class LoopsQuestion8 {
    public static void main(String[] args) {
        int num = 153, temp, sum = 0, remainder;
        temp = num;
        while (temp != 0) {
            remainder = temp % 10;
            sum += remainder * remainder * remainder;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
