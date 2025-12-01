package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * the user enters 2 numbers and the app
 * calculates the result of the division.
 * if the numerator is 0, the app closes
 * if the denominator is 0, the program goes back to the beginning
 */
public class DivisionApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int den = 0;
        int result = 0;

        while (true) {

            System.out.print("Please enter a numerator: ");
            num = in.nextInt();

            if (num == 0) {
                System.out.println("Numerator is 0. Quiting...");
                break;

            }
            System.out.print("Please enter a denominator: ");
            den = in.nextInt();

            if (den == 0) {
                System.out.println("Cannot divide by zero");
                continue;
            }
            result = num / den;
            System.out.printf("The result of %d divided by %d is %d", num, den, result);
        }
    }
}