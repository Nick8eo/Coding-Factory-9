package gr.aueb.cf.cf9.ch4;

import javax.imageio.plugins.tiff.ExifInteroperabilityTagSet;
import java.util.Scanner;

/**
 * Εμφανίζουμε μενού στον χρήστη.
 * Ο χρήστης δίνει το choice.
 * Ανάλογα με το choice να δώσουμε feedback
 * στον χρήστη
 */
public class SwitchApp {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int choice = 0;
        final int EXIT = 4;

        do {
            System.out.println("Παρακαλώ επιλέξτε ένα από τα ακόλουθα");
            System.out.println("1. One-Player Game");
            System.out.println("2. Two-Player Game");
            System.out.println("3. Team Game");
            System.out.println("4. Exit");

            choice = in.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Start One-Player Game");
                    break;
                case 2:
                    System.out.println("Start Two-Player Game");
                    break;
                case 3:
                    System.out.println("Start Team-Game");
                case 4:
                    System.out.println("Exit Game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }

        }while (choice != EXIT);
    }
}
