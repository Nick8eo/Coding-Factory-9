package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 *  Ο χρήστης δίνει την ηλικία του σε έτη(έστω ότι είναι ακέραιος)
 *  και το πρόγραμμα επιστρέφει την ηλικία σε ημέρες, όπου
 *  θεωρούμε ότι 1 έτος = 365 ημέρες
 */
public class YearsToDays {
    public static void main(String[] args) {
        // Αρχικοποίηση μεταβλητών
        final int DAYS_IN_YEAR = 365; //σταθερά
        Scanner scanner = new Scanner(System.in);
        int inputAgeInYears = 0;
        int ageInDays = 0;

        // Εντολές
        System.out.println("Παρακαλώ δώστε έτος γέννησης");
        inputAgeInYears = scanner.nextInt();
        ageInDays = inputAgeInYears*DAYS_IN_YEAR;
        System.out.printf("Η ηλικία σου είναι %,d μέρες",ageInDays);
    }
}
