package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * Ένας αριθμός Armstrong είναι αριθμός
 * που είναι ίσος με το άθροισμα των ψηφίων του
 * όπου το κάθε ψηφίο έχει υψωθεί στη δύναμη του
 * αριθμού των ψηφίων.
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int count = 0;
        int sum = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();
        int num2 = num;
        int num3 = num;
        while (num2 > 0) {
            num2 /= 10;
            count++;
        }
        while (num3 > 0) {
            int digit = num3 % 10;
            int result = 1;
            for (int i = 0; i < count; i++) {
                result *= digit;
            }
            num3 /= 10;
            sum += result;
        }

        System.out.printf("%d%s Armstrong \n", num, (sum == num) ? " is" : "is not");


        }

    }

