package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη ένα ποσό (ακέραιος) σε ευρώ και το
 * μετατρέπει σε δολάρια ΗΠΑ με βάση μια ισοτιμία. Για παράδειγμα,
 * αν ο χρήστης δώσει 100 ευρώ και η ισοτιμία είναι 1 Euro = 99 USD cents,
 * τότε τα συνολικά USA cents είναι 9900 και αυτό αντιστοιχεί σε 99 USA Dollars
 */
public class EuroToUsdConverter {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        final int EUROS_TO_CENTS = 99;
        final int CENTS_TO_DOLLARS = 100;
        int dollars = 0;
        int cents = 0;
        int euros = 0;
        Scanner in = new Scanner (System.in);

        // Εντολές
        System.out.println("Δώστε την ποσότητα χρημάτων σε ευρώ:");
        euros = in.nextInt();
        cents = euros * EUROS_TO_CENTS;
        dollars = cents / CENTS_TO_DOLLARS;
        cents = cents % CENTS_TO_DOLLARS;

        // Αποτελέσματα
        System.out.printf("Τα %d ευρώ αντιστοιχούν σε %d δολλάρια και %d cents", euros, dollars, cents);

    }
}
