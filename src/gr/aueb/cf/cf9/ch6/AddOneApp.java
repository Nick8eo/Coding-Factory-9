package gr.aueb.cf.cf9.ch6;

/**
 * Έστω ότι αναπαριστούμε μεγάλους ακεραίους
 * σε μορφή πίνακα. Θέλουμε να προσθέσουμε τη
 * μονάδα.
 */
public class AddOneApp {
    public static void main(String[] args) {

    }

    public static int[] addOne(int[] arr) {
        if (arr == null) return new int[0];
        int sum = 0;
        int carry = 1;
        int[] arr2 = new int[arr.length + 1];

        for (int i = arr.length - 1; i >= 0; i--) {

            sum = arr[i] + carry;
            arr2[i + 1] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 1) {
            arr2[0] = 1;
        }
        return arr2;
    }
}
