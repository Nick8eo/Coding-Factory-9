package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * user enters base and power and the app
 * calculates base^power
 */
public class PowerApp {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.print("Please enter base number: ");
        base = in.nextInt();

        System.out.print("Please enter power number: ");
        power = in.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.printf("The result of %d^%d = %d", base, power, result);
    }
}
