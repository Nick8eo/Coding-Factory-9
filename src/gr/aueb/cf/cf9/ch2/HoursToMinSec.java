package gr.aueb.cf.cf9.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Μετατροπή των ωρών που θα δώσει ο χρήστης σε λεπτά
 * και δευτερόλεπτα
 */
public class HoursToMinSec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int HOUR_TO_MIN = 60;
        final int HOUR_TO_SEC = 3600;
        int hours = 0;
        int min = 0;
        int sec = 0;

        System.out.println("Παρακαλώ δώστε ώρες για μετατροπή");
        hours = scanner.nextInt();
        min = hours * HOUR_TO_MIN;
        sec = min * HOUR_TO_SEC;

        System.out.printf("Οι %d ώρες είναι %,d λεπτά και %,d δευτερόλεπτα\n", hours, min, sec);
        System.out.printf(Locale.forLanguageTag("el"), "Οι %d ώρες είναι %,d λεπτά και %,d δευτερόλεπτα", hours, min, sec); //Ελληνική μορφή (. αντί για ,)

    }
}
