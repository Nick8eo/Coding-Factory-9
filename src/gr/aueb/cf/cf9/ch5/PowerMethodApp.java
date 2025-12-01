package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * it calculates the a^b result using a method
 * where a and b are given by the user
 */
public class PowerMethodApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Please provide the base number");
        base = in.nextInt();

        System.out.println("Please provide the power number");
        power = in.nextInt();

        result = powerCalc(base,power);
        System.out.printf("The result of %d ^ %d = %d", base, power, result);
    }

    /**
     * the method
     * @param a
     * @param b
     * @return
     */
    public static int powerCalc(int a, int b) {

        int result = 1;

        for (int i = 1; i <= b; i++){
            result *= a;
        }

        return result;
    }
}
