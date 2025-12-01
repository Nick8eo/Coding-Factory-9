package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * counts the number of positive numbers
 */
public class PositivesCountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positives = 0;

        System.out.println("Please enter a number:");
        num = in.nextInt();

        while (num > 0) {
            positives++;
            System.out.println("Please enter a number:");
            num = in.nextInt();
        }

        System.out.printf("The number of positive numbers is: %d", positives);
    }
}
