package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * calculates the power of a number, base^power
 * base^power = base * base * base * base ... (power φορές)
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("Παρακαλώ δώστε την βάση:");
        base = in.nextInt();
        System.out.println("Παρακαλώ δώστε τη δύναμη:");
        power = in.nextInt();

        while ( i <= power ) {
            result *= base;
            i += 1;
        }
        System.out.printf("Το αποτέλεσμα είναι: %d",result);
    }
}
