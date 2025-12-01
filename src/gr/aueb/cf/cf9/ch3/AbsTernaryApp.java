package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * the user gives a number and the app
 * shows the absolute of this number
 */
public class AbsTernaryApp {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num = 0;
        int abs = 0;

        System.out.print("Please enter a number: ");
        num = in.nextInt();

        abs = num < 0 ? -num : num;

        System.out.printf("The absolute of %d is %d", num , abs);
    }
}
