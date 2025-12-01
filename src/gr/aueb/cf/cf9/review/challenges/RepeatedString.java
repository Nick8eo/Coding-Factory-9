package gr.aueb.cf.cf9.review.challenges;

/**
 * Δοθέντος ενός {@link String} επιστρέφει ένα String
 * που αποτελεί επανάληψη του αρχικού String, Ν φορές.
 */
public class RepeatedString {

    public static void main(String[] args) {
        String str = "The string is this";
        int n = 5;

        System.out.println(repeatedString(str,n));

    }

    public static String repeatedString(String s, int n) {

        StringBuilder sb = new StringBuilder();
        String repeatedstring = "";

        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
