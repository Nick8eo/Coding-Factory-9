package gr.aueb.cf.cf9.review_challenges;

/**
 * Γράψτε μια μέθοδο που δέχεται δύο ακεραίους
 * και επιστρέφει το άθροισμά τους.
 */
public class SumOfTwo {

    public static void main(String[] args) {
        int sum = 0;
        int a = 10;
        int b = 20;

        sum = sumOfTwo(a, b);
        System.out.println(sum);
    }

    public static int sumOfTwo(int a, int b) {
        return a + b;
    }
}


