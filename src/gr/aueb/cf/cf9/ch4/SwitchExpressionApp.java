package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * switch usage that returns an outcome to a variable
 */
public class SwitchExpressionApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = 0;
        char classification = ' ';

        System.out.println("Please enter your grade:");
        grade = in.nextInt();

        classification = switch (grade)
        {
            case 1, 2, 3, 4 -> {
                System.out.println("Fail");
                yield 'D';
            }
                case 5, 6 -> 'C';
                case 7, 8 -> 'B';
                case 9, 10 -> 'A';
                default -> 'U';
        };

        System.out.println("Classification: " + classification);

    }
}
