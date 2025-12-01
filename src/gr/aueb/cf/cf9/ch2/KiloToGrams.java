package gr.aueb.cf.cf9.ch2;
/**
 * Μετατροπή των κιλών που διαβάζουμε από τον χρήστη σε γραμμάρια
 */

import java.util.Scanner;

public class KiloToGrams {
    public static void main(String[] args) {

        // Δήλωση μεταβλητών
        Scanner in = new Scanner(System.in);
        final int KILOS_TO_GRAMS = 1000;
        int kilos = 0;
        int grams = 0;

        //Εντολές
        System.out.println("Παρακαλώ εισάγετε το βάρος σε κιλά");
        kilos = in.nextInt();
        grams = kilos * KILOS_TO_GRAMS;

        //Αποτελέσματα
        System.out.printf("Τα %d κιλά είναι %,d γραμμάρια.", kilos, grams);


    }
}
