package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * counts the number of digits in a number
 * given by the user
 * e.g. 148 has 3 digits
 */
public class DigitsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digits = 0;
        int num = 0;
        int inputNum = 0;

        System.out.println("Please give a number:");
        num = in.nextInt();
        inputNum = num;

        while (num > 0 ) {
            digits++;
            num = num / 10;

        }
        System.out.printf("The number of digits of %d is: %d", inputNum, digits);
    }
}
