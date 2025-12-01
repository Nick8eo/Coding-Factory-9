package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 *  Υπολογίζει το παραγοντικό του n,
 *  με χρήση μεθόδου.
 */
public class FactorialApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please give the number for the factorial calculation:");

        n = in.nextInt();

        System.out.println(factorial(n));

    }

    /**
     * Calculates factorial of n.
     * @param n
     * @return
     */
    public static int factorial(int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
