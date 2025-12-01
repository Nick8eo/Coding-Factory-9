package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * calculates factorial of a number N. N is given by the user
 */
public class FactorialApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int factorial = 1;
        int result = 1;
        int i = 1;

        System.out.println("Παρακαλώ δώστε αριθμό για υπολογισμό παραγωντικού:");
        factorial = in.nextInt();
        while (i <= factorial) {
            result *= i;
            i ++;

        }
        System.out.printf("Το αποτέλεσμα είναι: %,d",result);
    }
}
