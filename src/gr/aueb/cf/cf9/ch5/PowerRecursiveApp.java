package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class PowerRecursiveApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Please enter the base number: ");
        base = in.nextInt();

        System.out.println("Please enter the power number: ");
        power = in.nextInt();

        result = pow(base, power);

        System.out.printf("The result of %d ^ %d is %d", base, power, result);
    }

    public static int pow(int base, int power) {

//        if (power == 0) {
//            return 1;
//        }
//
//        return base * power(base, power-1);

        return (power == 0) ? 1 : base * pow(base, power - 1);





    }


}
