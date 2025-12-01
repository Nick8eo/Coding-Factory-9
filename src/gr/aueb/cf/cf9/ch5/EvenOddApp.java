package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Ορίζει 2 μεθόδους, τις isEven και
 * isOdd για τον έλεγχο ενός ακεραίου,
 * αν είναι άρτιος ή περιττός
 */
public class EvenOddApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Please provide a number");
        num = in.nextInt();

        System.out.println("The number is even: " + isEven(num));
        System.out.println("The number is odd: " + isOdd(isEven(num)));
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(boolean n) {
        return !n;
    }
}
