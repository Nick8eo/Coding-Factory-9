package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Τριαδικός τελεστής demo. Υπολογίζει τον μικρότερο
 * μεταξύ δυο ακεραίων που δίνει ο χρήστης.
 */
public class TernaryApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please enter two numbers");
        num1 = in.nextInt();
        num2 = in.nextInt();

        min = num1 < num2 ? num1 : num2;
        // γίνεται σύγκριση. αν βγει αληθές, το ? είναι το ΤΟΤΕ και το : είναι το ΑΛΛΙΩΣ

        System.out.printf("The number %d is minimum", min);
    }
}
