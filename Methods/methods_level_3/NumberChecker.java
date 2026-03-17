import java.util.*;

public class NumberChecker {

    static int countDigits(int number) {
        int count = 0;
        number = Math.abs(number);
        if (number == 0) return 1;
        while (number > 0) { count++; number /= 10; }
        return count;
    }

    static int[] storeDigits(int number) {
        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    } static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++)
            if (digits[i] != 0) return true;
        return false;
    }

    // Armstrong: sum of (digit ^ numDigits) == number
    static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length, sum = 0;
        for (int d : digits) sum += (int) Math.pow(d, power);
        return sum == number;
    }

    static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) { second = largest; largest = d; }
            else if (d > second && d != largest) second = d;
        }
        return new int[]{largest, second};
    }

    static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) { second = smallest; smallest = d; }
            else if (d < second && d != smallest) second = d;
        }
        return new int[]{smallest, second};
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck   : " + isDuckNumber(digits));
        System.out.println("Armstrong: " + isArmstrong(number, digits));
        int[] lg = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + lg[0] + ", 2nd: " + lg[1]);
        int[] sm = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + sm[0] + ", 2nd: " + sm[1]);
    }
}