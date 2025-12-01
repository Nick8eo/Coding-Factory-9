package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**]
 * Ο Χρήστης εισάγει έναν ακέραιο που συμβολίζει μια
 * θερμοκρασία. Το πρόγραμμα υπολογίζει αν η
 * θερμοκρασία < 0 τότε μια μεταβλητή γίνεται true,
 * αλλιώς γίνεται false
 */
public class TemperatureApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        // Εισαγωγή Δεδομένων
        System.out.println("Παρακαλώ εισάγετε μια θερμοκρασία");
        temperature = in.nextInt();

        // Επεξεργασία δεδομένων
        isTempBelowZero = temperature < 0;

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Η θερμοκρασία είναι μικρότερη από 0:" + isTempBelowZero);
    }
}
