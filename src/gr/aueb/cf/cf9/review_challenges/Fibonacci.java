package gr.aueb.cf.cf9.review_challenges;

/**
 * Γράψτε μια μέθοδο που επιστρέφει τον n-οστό
 * αριθμό Fibonacci (0, 1, 1, 2, 3, 5, 8, ...).
 *
 * Παράδειγμα
 * Είσοδος: n = 0
 * Έξοδος: 0
 *
 * Είσοδος: n = 5
 * Έξοδος: 5
 *
 * Είσοδος: n = 7
 * Έξοδος: 13
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n = 7;

        System.out.println(fibonacci(n));
    }

    /**
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int fibo = 1;

        if (n < 0) throw new IllegalArgumentException("Το n δεν μπορεί να είναι αρνητικό");

        if (n == 0) return a;
        if (n == 1) return b;

        for (int i = 2; i <= n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
        }
        return fibo;
    }
}